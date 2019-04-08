package by.moiseenko.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
public class Matrix {

  private static final Logger LOG = LogManager.getLogger(Matrix.class.getName());
  private int m;
  private int n;
  private int[][] matrix;

  public Matrix(int m, int n) {
    if (m <= 0 || n <= 0) {
      throw new IllegalArgumentException(
          String.format(
              "Illegal matrix size, can't be equal or less than 0, but m = %d , n = %n", m, n));
    }
    this.m = m;
    this.n = n;
    randomInit();
    LOG.debug(toString());
  }

  private void randomInit() {
    if (matrix == null) matrix = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int k = 0; k < n; k++) {

        matrix[i][k] = (int) (Math.random() * 20 - 10);
      }
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("%nMatrix has size: %d x %d %n", matrix.length, matrix[0].length));
    for (int i = 0; i < m; i++) {
      sb.append('[');
      for (int k = 0; k < n; k++) {
        sb.append(String.format("%2d", matrix[i][k]));
        if (k < n - 1) {
          sb.append(", ");
        }
      }
      sb.append("]\n");
    }

    return sb.toString();
  }
}
