package io.github.danielfs.calculadora.operacao.binaria;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AdicaoTest{

    private Adicao adicao;
    
    @Before
    publiic void inicializar(){
    adicao = new Adicao();
    }
    
    @Test
    public void deveriaRetornar5QuandoPassa2e3(){
    doule valorEsperado = 5;
    double valorRetornado = adicao.calcular(2,3);
    
    
    assertEquals(valorEsperado, valorRetornado,0);
    
    }

}
