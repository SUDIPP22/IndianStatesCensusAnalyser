package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Purpose : To implement Indian State Census Analyser
 *
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-29
 */
public class CensusAnalyser {
    public static void main(String[] args) throws IOException, StateSensorAnalyserException {
        System.out.println("Welcome To The Program");
        String filePathRead = ".src/main/resources/IndianStateCensusData.csv";
        String fileName = "IndianStateCensusData";
        String delimiter =",";
        List<String> stringName = new ArrayList<>();
        stringName.add("State");
        stringName.add("Population");
        stringName.add("AreaInSqKm");
        stringName.add("DensityPerSqKm");

        ReadOperations readObj = new ReadOperations();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);

        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}
