package com.plurasight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ContractFileManager {
    private static final String File_Name = "contracts.csv";

    public void saveContract(Contract contract){
        try (PrintWriter pw = new PrintWriter(new FileWriter(File_Name, true))) {
            // Write dealership information
            if(contract instanceof SalesContract sc){
                pw.printf("SALE|%s|%s|%s|%s|%.2f|%.2f|%.2f|%.2f|%b|%.2f%n", sc.getDate(), sc.getCustomerName(),sc.getEmail(),
                sc.getVehicle().toCSV(),sc.getSalesTaxAmount(),sc.getRecordingFee(),sc.getProcessingFee(),
                        sc.getTotalPrice(),sc.isFinanceOption() ? "Yes" : "No", sc.getMonthlyPayment());
            }else if(contract instanceof LeaseContract lc){
                pw.printf("Lease|%s|%s|%s|%s|%.2f|%.2f|%.2f|%.2f%n", lc.getDate(),lc.getCustomerName(), lc.getEmail(),
                        lc.getVehicle().toCSV(), lc.getExpectedEndingValue(),lc.getLeaseFee(), lc.getTotalPrice(),lc.getMonthlyPayment());
            }
            System.out.println("Contract saved successfully to " + File_Name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
