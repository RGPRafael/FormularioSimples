/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SimpleFormUser.EmailFomUser.Repository;

import SimpleFormUser.EmailFomUser.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author rafael
 */
public interface FormUserRepo extends JpaRepository< User, Long> {
    
}
