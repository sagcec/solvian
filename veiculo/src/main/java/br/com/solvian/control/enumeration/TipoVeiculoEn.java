package br.com.solvian.control.enumeration;

public enum TipoVeiculoEn {

	T {
		@Override
		public String toString() {
			return "TRACAO";
		}
	},

	E {
		@Override
		public String toString() {
			return "ESPECIE";
		}
	},

	C {
		@Override
		public String toString() {
			return "CATEGORIA";
		}
	},

}