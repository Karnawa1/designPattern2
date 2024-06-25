package com.SDC.designPattern2.util;

import com.SDC.designPattern2.model.CreditApplication;
import com.SDC.designPattern2.model.HomeLoanApplication;
import com.SDC.designPattern2.model.PersonalLoanApplication;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static List<CreditApplication> readApplicationsFromFile(String filePath) throws IOException {
        List<CreditApplication> applications = new ArrayList<>();
        try (InputStream is = FileUtil.class.getClassLoader().getResourceAsStream(filePath);
             BufferedReader br = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                CreditApplication app;
                if (data[0].equalsIgnoreCase("Personal")) {
                    app = new PersonalLoanApplication();
                } else {
                    app = new HomeLoanApplication();
                }
                app.setApplicantName(data[1]);
                app.setAmount(Double.parseDouble(data[2]));
                applications.add(app);
            }
        }
        return applications;
    }
}