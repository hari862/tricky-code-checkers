package com.samplecodetests.java8examples.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMapConverter {

    public static void main(String[] args) {
        ArrayList<Company> companies = new ArrayList<>(Arrays.asList(
                new Company(1, "TCS", "ITPL"),
                new Company(2, "Infosys", "Electronic City Phase 1"),
                new Company(3, "Wipro", "Electronic City Phase 2")
                ));

        System.out.println("Companies are \n" + companies);

        System.out.println("Converting companies list to Map before Java 8");

        Map<Long, Company> companyMap = new HashMap<>();
        for (Company company:companies) {
            companyMap.put(company.getCompanyId(),company);
        }
        System.out.println("Companies Map using Java 7 \n" + companyMap);

        System.out.println("Converting companies list to Map Using Java 8");

        // Function.identity() - Returns a function that always returns its input argument.
        Map<Long, Company> companyMapJava8 = companies.stream()
                .collect(Collectors.toMap(Company::getCompanyId, Function.identity()));

        System.out.println("Companies Map using Java 8 \n" + companyMapJava8);

        System.out.println("Adding two duplicates entries in List \n" +
                "and then populating Map with mergeFunction in \n" +
                "Collectors.toMap(keyMapper, valueMapper, mergeFunction)");
        // (c1,c2)->c2 means (oldValue, newValue) -> newValue self explanatory
        // if mergeFuction not used then we will get exception

        companies.add(new Company(1, "TCS", "L Center"));
        companies.add(new Company(2, "Accenture", "Q-City"));

        System.out.println("Updated Companies List \n" + companies);

        Map<Long, Company> companyMap2 = companies.stream()
                .collect(Collectors.toMap(Company::getCompanyId, Function.identity(), (c1, c2) -> c2));

        System.out.println("Companies Map using Java 8 - mergeFunction \n" + companyMap2);


        // Additional useCases of Collectors.toMap()
        Map<Long, String> companyMapIdName = companies.stream()
                .collect(Collectors.toMap(Company::getCompanyId, Company::getCompanyName
                        , (oldValue, newValue) -> oldValue));

        System.out.println("Company Map with Id and Name only" + companyMapIdName);

    }
}

class Company {
    private long companyId;
    private String companyName;
    private String companyAddress;

    public Company() {
    }

    public Company(long companyId, String companyName, String companyAddress) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                '}' + "\n";
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
}