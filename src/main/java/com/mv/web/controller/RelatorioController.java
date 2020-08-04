package com.mv.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/relatorios")
public class RelatorioController {
	
	@GetMapping("/saldo-cliente")
	public String saldoCliente() {
		return "/relatorio/relSaldoCliente";
	}
	
	@GetMapping("/saldo-cliente-periodo")
	public String saldoClientePeriodo() {
		return "/relatorio/relSaldoClientePeriodo";
	}
	
	@GetMapping("/saldo-todos-clientes")
	public String saldoTodosClientes() {
		return "/relatorio/relSaldoTodosClientes";
	}
	
	@GetMapping("/receita-empresa-periodo")
	public String receitaEmpPeriodo() {
		return "/relatorio/relReceitaEmpPeriodo";
	}
}
