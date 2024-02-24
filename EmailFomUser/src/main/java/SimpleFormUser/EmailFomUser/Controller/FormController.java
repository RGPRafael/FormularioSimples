package SimpleFormUser.EmailFomUser.Controller;

import SimpleFormUser.EmailFomUser.Model.User;
import SimpleFormUser.EmailFomUser.Repository.FormUserRepo;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rafael
 */
//@EnableGlobalMethodSecurity(securedEnabled = false)
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/FormulariosEmails")
public class FormController {
    
    /* We use @Autowired to inject TutorialRepository bean to local variable. */
    @Autowired
    private FormUserRepo Repository;
    
    @PostMapping
    @Transactional
    public ResponseEntity cadastro( @RequestBody User user ){
        try {
            
            User new_user = new User();
            User save = Repository.save( user ); 
            return ResponseEntity.ok(user);
        
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception or handle it as needed
            // Se ocorrer um erro durante o cadastro, retorna um status de erro 500 Internal Server Error
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }
    
    @GetMapping("/bucarID/{id}")
    public User buscarID(@PathVariable Long id) {
        User user = Repository.getById(id);
        return user;
    }
    
    
     /*exclusao no banco */
    
    @DeleteMapping("/{id}")
    public ResponseEntity  delete(@PathVariable Long id) {
         Repository.deleteById(id);
         return ResponseEntity.noContent().build();

    }
    
    
    @PutMapping()
    @Transactional
    public ResponseEntity Atualizar(@RequestBody User user ) {
            User update_user = new User();
            User referenceById = Repository.getReferenceById(update_user.getID());
            return ResponseEntity.ok(referenceById);
    }
    
    
    @GetMapping("")
    public List<User> listar(Pageable pagina) {
        List<User> findAll = Repository.findAll(pagina).toList();
        
        return findAll;
    }
}

    
    
   
    

    
    
    
    
    
    

  
    

