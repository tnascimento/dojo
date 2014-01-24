package com.tr.dojo005;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BolicheTest {
	
	Boliche boliche;
	
	@Before
	public void setUp() {
		boliche = new Boliche();
	}
	
	@Test
	public void testUmaJogada() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j = new Jogada(3, 2);
		listaJogadas.add(j);
		
		assertEquals(5, boliche.resultadoPlacar(listaJogadas));
	}

	@Test
	public void testSpareVerdadeiro() {
		Jogada j = new Jogada(2,8);
		assertTrue( j.isSpare());
	}
	
	@Test
	public void testSpareFalso() {
		Jogada j = new Jogada(1,8);
		assertFalse( j.isSpare());
	}
	
	@Test
	public void testSpareFalsoStrike() {
		Jogada j = new Jogada(10,0);
		assertFalse( j.isSpare());
	}
	
	@Test
	public void testStrikeVerdadeiro() {
		Jogada j = new Jogada(10,0);
		assertTrue( j.isStrike());
	}
	
	@Test
	public void testJogadaComSpare() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j = new Jogada(9, 1);
		listaJogadas.add(j);
		
		assertEquals(10, boliche.resultadoPlacar(listaJogadas));
	}

	@Test
	public void test2JogadasCom1Spare() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(8, 2);
		Jogada j2 = new Jogada(5, 2);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		
		assertEquals(22, boliche.resultadoPlacar(listaJogadas));
	}

	@Test
	public void test3JogadasCom2Spare() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(8, 2);
		Jogada j2 = new Jogada(5, 5);
		Jogada j3 = new Jogada(5, 2);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		
		assertEquals(37, boliche.resultadoPlacar(listaJogadas));
	}

	@Test
	public void test3JogadasCom2Spare32() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(8, 2);
		Jogada j2 = new Jogada(0, 10);
		Jogada j3 = new Jogada(5, 2);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		
		assertEquals(32, boliche.resultadoPlacar(listaJogadas));
	}
	
	@Test
	public void test2JogadasCom1Strike() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(5, 2);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		
		assertEquals(24, boliche.resultadoPlacar(listaJogadas));
//		10+5+2+5+2
	}
	
	@Test
	public void test3JogadasCom2Strike() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(3, 5);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		
		assertEquals(49, boliche.resultadoPlacar(listaJogadas));
//		10+10+3 = 23 + 10 + 3 + 5 = 41 + 8 = 49 
	}
	
	@Test
	public void test3JogadasCom3Strike() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		
		assertEquals(60, boliche.resultadoPlacar(listaJogadas));
//		10+10+10 = 30 + 10 + 10 = 50 + 10 = 60 
	}
	
	@Test
	public void test3JogadasCom2Strikes() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(3, 5);
		Jogada j3 = new Jogada(10, 0);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		
		assertEquals(36, boliche.resultadoPlacar(listaJogadas));
//		10+3+5 = 18 + 3 + 5 = 26 + 10 = 36 
	}

	@Test
	public void test4JogadasCom1Strikes1Spare() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(3, 5);
		Jogada j3 = new Jogada(0, 10);
		Jogada j4 = new Jogada(5, 3);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		
		assertEquals(49, boliche.resultadoPlacar(listaJogadas));
//		10+3+5 = 18 + 3 + 5 = 26 + 10 = 36 + 5 = 41 + 5 + 3 = 49
	}

	@Test
	public void test10Jogadas() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(1, 0);
		Jogada j2 = new Jogada(1, 0);
		Jogada j3 = new Jogada(1, 0);
		Jogada j4 = new Jogada(1, 0);
		Jogada j5 = new Jogada(1, 0);
		Jogada j6 = new Jogada(1, 0);
		Jogada j7 = new Jogada(1, 0);
		Jogada j8 = new Jogada(1, 0);
		Jogada j9 = new Jogada(1, 0);
		Jogada j10 = new Jogada(1, 0);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		listaJogadas.add(j10);
		
		assertEquals(10, boliche.resultadoPlacar(listaJogadas));
	}

	@Test
	public void test9Jogadas9Strikes() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		Jogada j4 = new Jogada(10, 0);
		Jogada j5 = new Jogada(10, 0);
		Jogada j6 = new Jogada(10, 0);
		Jogada j7 = new Jogada(10, 0);
		Jogada j8 = new Jogada(10, 0);
		Jogada j9 = new Jogada(10, 0);
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		
		assertEquals(240, boliche.resultadoPlacar(listaJogadas));
	}

	@Test
	public void test10Jogadas10Strikes() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		Jogada j4 = new Jogada(10, 0);
		Jogada j5 = new Jogada(10, 0);
		Jogada j6 = new Jogada(10, 0);
		Jogada j7 = new Jogada(10, 0);
		Jogada j8 = new Jogada(10, 0);
		Jogada j9 = new Jogada(10, 0);
		Jogada j10 = new Jogada(2, 8);
		Jogada j11 = new Jogada(10, 0);
		
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		listaJogadas.add(j10);
		listaJogadas.add(j11);
		
		assertEquals(272, boliche.resultadoPlacar(listaJogadas));
	}
	
	@Test
	public void testJogoPerfeito() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		Jogada j4 = new Jogada(10, 0);
		Jogada j5 = new Jogada(10, 0);
		Jogada j6 = new Jogada(10, 0);
		Jogada j7 = new Jogada(10, 0);
		Jogada j8 = new Jogada(10, 0);
		Jogada j9 = new Jogada(10, 0);
		Jogada j10 = new Jogada(10, 0);
		Jogada j11 = new Jogada(10, 10);
//		Jogada j12 = new Jogada(10, 0);
		
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		listaJogadas.add(j10);
		listaJogadas.add(j11);
//		listaJogadas.add(j12);
		
		assertEquals(300, boliche.resultadoPlacar(listaJogadas));
	}
	
	@Test
	public void testJogoAleatorio() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		Jogada j4 = new Jogada(10, 0);
		Jogada j5 = new Jogada(10, 0);
		Jogada j6 = new Jogada(10, 0);
		Jogada j7 = new Jogada(10, 0);
		Jogada j8 = new Jogada(10, 0);
		Jogada j9 = new Jogada(4, 2);
		Jogada j10 = new Jogada(10, 0);
		Jogada j11 = new Jogada(10, 10);
		
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		listaJogadas.add(j10);
		listaJogadas.add(j11);
		
		assertEquals(256, boliche.resultadoPlacar(listaJogadas));
	}
	
	@Test
	public void testJogoAleatorio2() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		Jogada j4 = new Jogada(10, 0);
		Jogada j5 = new Jogada(10, 0);
		Jogada j6 = new Jogada(10, 0);
		Jogada j7 = new Jogada(10, 0);
		Jogada j8 = new Jogada(1, 1);
		Jogada j9 = new Jogada(1, 1);
		Jogada j10 = new Jogada(10, 0);
		Jogada j11 = new Jogada(10, 10);
		
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		listaJogadas.add(j10);
		listaJogadas.add(j11);
		
		assertEquals(217, boliche.resultadoPlacar(listaJogadas));
	}
	
	@Test
	public void testJogoSemStrikesNoFinal() {
		List<Jogada> listaJogadas = new ArrayList<>();
		Jogada j1 = new Jogada(10, 0);
		Jogada j2 = new Jogada(10, 0);
		Jogada j3 = new Jogada(10, 0);
		Jogada j4 = new Jogada(10, 0);
		Jogada j5 = new Jogada(10, 0);
		Jogada j6 = new Jogada(10, 0);
		Jogada j7 = new Jogada(10, 0);
		Jogada j8 = new Jogada(1, 1);
		Jogada j9 = new Jogada(1, 1);
		Jogada j10 = new Jogada(1, 0);
		
		listaJogadas.add(j1);
		listaJogadas.add(j2);
		listaJogadas.add(j3);
		listaJogadas.add(j4);
		listaJogadas.add(j5);
		listaJogadas.add(j6);
		listaJogadas.add(j7);
		listaJogadas.add(j8);
		listaJogadas.add(j9);
		listaJogadas.add(j10);
		
		assertEquals(188, boliche.resultadoPlacar(listaJogadas));
	}
}
