package exercicio31;


/**
 *
 * @author tl
 */
public class Matrix {

    private int cols;
    private int rows;
    private int[][] values;

    public Matrix(int nRows, int nCols) {
        cols = nCols;
        rows = nRows;
        values = new int[rows][cols];
    }
    /* Criar um constructor e uma 
     * matriz quadrada de valor n
     * 
     * @requires que o valor seja positivo e inteiro
     * @ensures que o contructor é criado com n colunas
     * e n linhas
     */
    public Matrix(int n) {
        this(n, n);
    }
    
    /*
     * @requires Necessário o contrutor da matrix ter sido inicializado
     * @ensures devolve um inteiro com numero de linhas da matrix
     */
    public int rows() {
        return rows;
    }
    
    /*
     * @requires Necessário o contrutor da matrix ter sido inicializado
     * @ensures devolve um inteiro com o numero de colunas da matrix
     */
    public int cols() {
        return cols;
    }
    
    /*
     * @requires Construtor estar inicializado e os parametros i,j serem positivos 
     * 			 menores que o tamanho maximo ta matrix.
     * @ensures devolve um valor inteiro da linha i e coluna j
     */
    public int get(int i, int j) {
        return values[i][j];
    }
    
    /*
     * @requires Construtor estar inicializado e os parametros i,j serem positivos
     * 			 menores que o tamanho maximo ta matrix
     * @ensures Muda o valor da linha i, e coluna j para o valor do parametro value
     */
    public void set(int i, int j, int value) {
        values[i][j] = value;
    }
    
    /*
     * @requires Parametro ser um objecto matrix
     * @ensures verifica se uma matrix tem os mesmo valores da outra.
     * 			verifica se matrixes tem o mesmo tamanho.
     */
    public boolean equalTo(Matrix other) {
         if (cols != other.cols || rows != other.rows) { 
             return false;
         }
         for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                 if (values[i][j] != other.values[i][j]) {
                     return false;
                 } 
             }
         }
         return true;
    }
    
    /*
     * @requires Parametro ser um objecto matrix
     * @ensures  Os novos valores da matrix são adicionados 
     * ao da matrix antiga.
     */
    public void addWith(Matrix other) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                values[i][j] += other.values[i][j];
            }
        }
    }
    
    /*
     * @requires Parametro ser um objecto matrix
     * @ensures Devolve um novo objecto Matrix
     * com o resultado da soma da matrix antiga e da nova.
     */
    public Matrix add(Matrix other) {
        Matrix result = new Matrix(rows,cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.values[i][j] = values[i][j] + other.values[i][j];
            }
        }
        return result;
    }
    
    /*
     * @requires Matrix tem de estar instanciada.
     * @ensures Troca os as linhas pelas colunas da matrix 
     * instanciada.
     */
    public void transpose() {
        int[][] newValues = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newValues[j][i] = values[i][j];
            }
        }
        values = newValues;
        rows = newValues.length;
        cols = newValues[0].length;
    }
    
    /*
     * @requires O parametro ser um inteiro positivo
     * @ensures devolve uma matrix quadrada com a sua identidade
     */
    static public Matrix indentity(int n) {
        Matrix result = new Matrix(n, n);
        for (int i = 0; i < result.rows; i++) {
            result.set(i, i, 1);
        }
        return result;
    }
}
 