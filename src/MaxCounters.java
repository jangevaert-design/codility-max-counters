public class MaxCounters {

  public int[] solution(int N, int[] A) {
    int[] counters = new int[N];
    int startLine = 0;
    int currentMax = 0;

    for (int i = 0; i < A.length; i++) {
      int x = i - 1;
      if (i > N) {
        startLine = currentMax;
      } else if (counters[x] < startLine) {
        counters[x] = startLine + 1;
      } else {
        counters[x] += 1;
      }
      if (i <= N && counters[x] > currentMax) {
        currentMax = counters[x];
      }
    }
    for (int i = 0; i < counters.length; i++) {
      if (counters[i] < startLine) {
        counters[i] = startLine;
      }
    }
    return counters;
  }

}
