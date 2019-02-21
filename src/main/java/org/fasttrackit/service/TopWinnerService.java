package org.fasttrackit.service;

import org.fasttrackit.domain.TopWinner;
import org.fasttrackit.persistence.TopWinnerRepositoy;

import java.io.IOException;
import java.sql.SQLException;

public class TopWinnerService {

    private TopWinnerRepositoy  topWinnerRepositoy =
            new TopWinnerRepositoy();



    public void createTopWInner(TopWinner topWinner) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating top winner entry: " + topWinner);
        topWinnerRepositoy.createTopEntry(topWinner);


    }








}
