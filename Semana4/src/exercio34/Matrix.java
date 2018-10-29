package exercio34;

import javax.swing.plaf.synth.SynthSeparatorUI;

/**
 * Representa uma matriz em que o cliente pode construir
 * conforme deseje. Seja n linhas ou m colunas ou n quadrado
 * @author saulsilva
 * 
 */
public class Matrix {
	public int linhas;
	public int colunas;
	public double[][] matrix;
	public double[][] mTranspose;

	/**
	 * Cria uma instancia Matriz. A matriz criada tera 
	 * n - linhas e m - colunas.
	 * @param n - numero de linhas
	 * @param m- numero de colunas
	 * 
	 */
	Matrix(int n, int m){
		this.linhas = n;
		this.colunas = m;
		this.matrix = new double[n][m];
		this.mTranspose = new double[m][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				matrix[i][j] = 0.0;
				mTranspose[j][i] = 0.0;
			}
		}
	}

	/**
	 * Cria uma instancia Matriz. A matriz criada tera
	 * as linhas e colunas do mesmo tamanho.
	 * @param n - Numero de linhas
	 * @param m - Numero de coluna
	 */
	Matrix(int n){
		this(n,n);
	}

	/**
	 * 
	 * Objetivo é saber quantas linhas existem na Matriz
	 * @return - Devolve o número de linhas da matriz
	 */
	int rows() {
		return linhas;
	}

	/**
	 * Objetivo é saber quantas colunas existem numa Matriz
	 * @return - Devolve o número de colunas da Matriz
	 */
	int cols() {
		return colunas;
	}

	/**
	 * 
	 * @param n
	 * @param m
	 */
	double get(int r, int c) {
		return matrix[r][c];
	}

	/**
	 * 
	 * @param n
	 * @param m
	 */
	void set(int r, int c, double v) {
		this.matrix[r][c] = v;
		this.mTranspose[c][r] = v;
	}

	/**
	 * 
	 * @param n
	 * @param m
	 */
	boolean equalTo(Matrix other) {

		int valor = 0;
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				if(this.get(i,j) == other.get(i, j)) {
					valor = 0;
				}else{
					valor +=1;
				}
			}
		}
		if(valor == 0) {
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 
	 * @param n
	 * @param m
	 */
	void addWith(Matrix other) {
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				double valor = (get(i,j) + other.get(i, j));
				set(i,j,valor);
			}
		}
	}

	/**
	 * 
	 * @param n
	 * @param m
	 */
	Matrix add(Matrix other) {
		int cols = other.cols();
		int rowss = other.rows();
		Matrix m = new Matrix(cols,rowss);
		m.add(other);
		return m;
	}

	/**
	 * 
	 * @param n
	 * @param m
	 */
	void transpose() {
		for(int i = 0; i < colunas; i++) {
			StringBuilder linha = new StringBuilder();
			for(int j = 0; j < linhas; j++) {
				linha.append(mTranspose[i][j]);
				linha.append(" ");
			}
			System.out.println(linha);
		}
	}

	static Matrix identityMatrix(int n) {
		Matrix matriIdent = new Matrix(n);
		for(int i = 0; i < matriIdent.rows();i++) {
			for(int j = 0; j < matriIdent.cols(); j++) {
				if(i == j) {
					matriIdent.set(i, j, 1);
				}
			}
		}
		return matriIdent;
	}

	void imprimeMatrix(Matrix m) {
		for(int i = 0; i < m.rows(); i++) {
			StringBuilder linha = new StringBuilder();
			for(int j = 0; j < m.cols(); j++) {
				linha.append(get(i,j));
				linha.append(" ");
			}
			System.out.println(linha);
		}
	}



}
