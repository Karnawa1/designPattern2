package com.SDC.designPattern2.main;

import com.SDC.designPattern2.decorator.FastTrackDecorator;
import com.SDC.designPattern2.decorator.InsuranceDecorator;
import com.SDC.designPattern2.factory.ApplicationFactory;
import com.SDC.designPattern2.factory.HomeLoanApplicationFactory;
import com.SDC.designPattern2.factory.PersonalLoanApplicationFactory;
import com.SDC.designPattern2.mediator.BankSystemMediator;
import com.SDC.designPattern2.model.CreditApplication;
import com.SDC.designPattern2.model.PersonalLoanApplication;
import com.SDC.designPattern2.repository.ApplicationRepository;
import com.SDC.designPattern2.util.FileUtil;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BankSystemMediator mediator = new BankSystemMediator();
        ApplicationRepository repository = new ApplicationRepository();

        List<CreditApplication> applications = FileUtil.readApplicationsFromFile("applications.txt");

        for (CreditApplication app : applications) {
            ApplicationFactory factory;
            if (app instanceof PersonalLoanApplication) {
                factory = new PersonalLoanApplicationFactory();
            } else {
                factory = new HomeLoanApplicationFactory();
            }

            CreditApplication application = factory.createApplication();
            application.setApplicantName(app.getApplicantName());
            application.setAmount(app.getAmount());

            application = new InsuranceDecorator(application);
            application = new FastTrackDecorator(application);

            mediator.notify(application, "submit");
            repository.addApplication(application);
        }

        repository.getAllApplications().forEach(app -> {
            System.out.println(app.getApplicantName() + ": " + app.getStatus());
        });
    }
}
