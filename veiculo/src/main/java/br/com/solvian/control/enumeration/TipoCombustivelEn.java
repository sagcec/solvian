package br.com.solvian.control.enumeration;

public enum TipoCombustivelEn {

	A {
		@Override
		public String toString() {
			return "ALCOOL";
		}
	},

	G {
		@Override
		public String toString() {
			return "GASOLINA";
		}
	},

	D {
		@Override
		public String toString() {
			return "DIESEL";
		}
	},

	N {
		@Override
		public String toString() {
			return "GNV";
		}
	},

}