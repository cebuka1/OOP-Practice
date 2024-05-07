package Demo_project.service.impl;

import Demo_project.model.Applicants;
import Demo_project.service.ApplicantService;

public class ApplicantServiceImpl  implements ApplicantService{

    @Override
    public void display(Applicants applicants) {
        System.out.println("FullName : " + applicants.getName() + "\n" + "Gender : " + applicants.getName() + "\n" +
                "Age : " +  applicants.getAge());
    }

    @Override
    public void admitStudent(Applicants applicants) {

    }
}

