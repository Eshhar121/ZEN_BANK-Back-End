package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    private String transactionId;
    private Double total;
    private Date date;
    private String receiverAccNo;
    private String senderAccNo;
}
