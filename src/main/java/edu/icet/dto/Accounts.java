package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Accounts {
    private String accountNo;
    private String id;
    private String account_name;
    private String branch;
    private String mobile;
    private String email;
}
