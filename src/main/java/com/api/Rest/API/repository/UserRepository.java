package com.api.Rest.API.repository;

import com.api.Rest.API.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        } else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Teste1","teste1@gmail.com","password"));
        usuarios.add(new User("Teste2","teste2@gmail.com","masterpass"));
        return usuarios;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Teste","teste1@gmail.com","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Recebendo o usernamae: %s para localizar um usuário", username));
        return new User("Teste2","teste2@gmail.com","masterpass");
    }
}