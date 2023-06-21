package com.example.awsProject.DTO;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProdutoDTO {

    private String name;
    private String code;
    private Float price;
}
