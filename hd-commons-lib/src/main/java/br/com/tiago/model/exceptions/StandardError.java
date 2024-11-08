package br.com.tiago.model.exceptions;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class StandardError {

    /*realizando testes com git ignore*/

    private LocalDateTime timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
