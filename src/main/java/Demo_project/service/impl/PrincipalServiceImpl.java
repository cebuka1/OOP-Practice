package Demo_project.service.impl;

import Demo_project.model.Principal;
import Demo_project.service.PrincipalService;

public class PrincipalServiceImpl implements PrincipalService {
    @Override
    public void display(Principal principal) {

        System.out.println("FullName : " + principal.getName() + "\n" + "Gender : " + principal.getGender() + "\n" +
                "Age : " +  principal.getAge());
    }
}
