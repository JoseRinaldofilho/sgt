package br.com.basis.sgt3.entities;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TarefaNaoEncontradaException extends RuntimeException {
}

