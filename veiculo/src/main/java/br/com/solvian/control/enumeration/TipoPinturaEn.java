package br.com.solvian.control.enumeration;

public enum TipoPinturaEn {

	I {
		@Override
		public String toString() {
			return "IMERSAO";
		}
	},

	L {
		@Override
		public String toString() {
			return "PINCEL";
		}
	},

	R {
		@Override
		public String toString() {
			return "ROLO";
		}
	},

	P {
		@Override
		public String toString() {
			return "PISTOLA";
		}
	},

	E {
		@Override
		public String toString() {
			return "ELETROSTATICA";
		}
	},

}