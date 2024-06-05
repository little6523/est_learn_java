public class Java_20240604 {
  public void learn() {
    // --------------------------------------------실습 1--------------------------------
    //    int i = 1;
    //    while (i <= 5) {
    //      System.out.println("현재 i의 값은 = " + i);
    //      i++;
    //    }
    //
    //    int i = 10;
    //    while (i >= 0) {
    //      System.out.println("현재 카운트 : " + i);
    //      i--;
    //    }
    //    System.out.println("카운트 종료");
    //
    //        int i = 1;
    //        int res = 0;
    //        int n = 100;
    //
    //        while (i <= n) {
    //          res += i;
    //          i += 1;
    //        }
    //        System.out.println(res);
    //
    //    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    //    int sum = 0;
    //    int i = 0;
    //    while (i < numbers.length) {
    //      sum += numbers[i];
    //      i++;
    //    }
    //    System.out.println(sum / numbers.length);
    // --------------------------------------------실습 1--------------------------------
    // --------------------------------------------실습 2--------------------------------
    //    int i = 0;
    //    while (i <= 300) {
    //      i++;
    //      if (i % 3 == 0) {
    //        System.out.println(i);
    //      }
    //    }
    //
    //    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    //    int max = 0;
    //    int i = 0;
    //    while (i < numbers.length) {
    //      if (numbers[i] > max) {
    //        max = numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println("최댓값: " + max);
    //
    //        int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
    //
    //    int posNum = IntStream.of(numbers).filter(num -> num > 0).sum();
    //    int neNum = IntStream.of(numbers).filter(num -> num < 0).sum();
    //    System.out.println(posNum);
    //    System.out.println(neNum);
    //
    //    int i = 0;
    //    int positive = 0;
    //    int negative = 0;
    //    while (i < numbers.length) {
    //      if (numbers[i] > 0) {
    //        positive += numbers[i];
    //      } else {
    //        negative += numbers[i];
    //      }
    //      i++;
    //    }
    //    System.out.println("positive: " + positive);
    //    System.out.println("negative: " + negative);
    // --------------------------------------------실습 2--------------------------------
    // --------------------------------------------실습 3--------------------------------
    //    int sum = 0;
    //    for (int i = 1; i <= 100; i++) {
    //      if (i % 2 == 0) {
    //        sum += i;
    //      }
    //    }
    //    int res = IntStream.rangeClosed(1, 100).filter(i -> i % 2 == 0).sum();
    //    System.out.println(sum);
    //    System.out.println(res);

    //    int sum = 0;
    //    int n = 20;
    //    for (int i = 1; i <= n; i++) {
    //      if ((i % 3 == 0) && (i % 5 == 0)) {
    //        sum += i;
    //      }
    //    }
    //    System.out.println(sum);
    //
    //        int res = IntStream.rangeClosed(1, n).filter(i -> (i % 3 == 0) && (i % 5 == 0)).sum();
    //        System.out.println(res);

    //    int[] fibonacci = new int[10];
    //        fibonacci[0] = 1;
    //        fibonacci[1] = 1;
    //        for (int i = 2; i < 10; i++) {
    //          fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
    //        }
    //        System.out.println(Arrays.toString(fibonacci));
    //
    //    int past1 = 0;
    //    int past2 = 1;
    //    int now = 1;
    //
    //    for (int i = 0; i < 10; i++) {
    //      System.out.print(now + " ");
    //      now = past1 + past2;
    //      past1 = past2;
    //      past2 = now;
    //    }
    // --------------------------------------------실습 3--------------------------------
    // --------------------------------------------실습 4--------------------------------
    //    for (int i = 0; i > -100; i--) {
    //      if (i % 2 == 0) {
    //        System.out.println(i);
    //      }
    //    }
    //    int[] arr = new int[100];
    //    arr[0] = 1;
    //    arr[1] = 1;
    //
    //    for (int i = 2; i < arr.length; i++) {
    //      arr[i] = arr[i - 1] + arr[i - 2];
    //    }
    //    System.out.println(Arrays.toString(arr));
    //
    //    Arrays.setAll(arr, i -> (i < 2) ? 1 : arr[i - 1] + arr[i - 2]);
    //    System.out.println(Arrays.toString(arr));
    // --------------------------------------------실습 4--------------------------------
    // --------------------------------------------실습 5--------------------------------
    //    for (int i = 1; i <= 9; i++) {
    //      for (int j = 1; j <= 9; j++) {
    //        System.out.printf("%s x %s = %s%n", i, j, i * j);
    //      }
    //    }
    //
    //    for (int i = 19; i > 0; i--) {
    //      System.out.printf("%d x %d = %d\n", 19, i, 19 * i);
    //    }
    //
    //    int number = 0;
    //    while (number < 10) {
    //      System.out.println("현재숫자: " + number);
    //      if (number == 5) {
    //        System.out.println("5가 되었습니다.");
    //        break;
    //      }
    //      number++;
    //    }
    //
    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("현재 i의 값은 = " + i);
    //      for (int j = 0; j < 10; j++) {
    //        System.out.println("현재 j의 값은 = " + j);
    //        if (j == 5) {
    //          break;
    //        }
    //      }
    //    }
    //
    //    //     이중포문을 만든다. i -> 1~100, j -> 2 -> 100
    //    //     i가 50이되면 break, j는 80되면 break;
    //    for (int i = 1; i <= 100; i++) {
    //      if (i == 50) break;
    //      System.out.println("현재 i의 값은 = " + i);
    //      for (int j = 2; j <= 100; j++) {
    //        if (j == 80) break;
    //        System.out.println("현재 j의 값은 = " + j);
    //      }
    //    }
    // --------------------------------------------실습 5--------------------------------
    // --------------------------------------------실습 6--------------------------------
    //        int number = 0;
    //
    //        while (number < 10) {
    //          number++;
    //          if (number == 3) {
    //            continue;
    //          } else {
    //            System.out.println("현재 값은 :" + number);
    //          }
    //        }
    //
    //    for (int i = 0; i < 10; i++) {
    //      if (i == 3) {
    //        continue;
    //      } else {
    //        System.out.println("현재값은 : " + i);
    //      }
    //    }
    //
    //    for (int i = 0; i < 10; i++) {
    //      if (i == 5) {
    //        break;
    //      }
    //      for (int j = 0; j < 10; j++) {
    //        if (j == 5) {
    //          continue;
    //        }
    //        System.out.println(j);
    //      }
    //    }
    //
    //        for (int i = 1; i <= 10; i++) {
    //          if (i == 4 || i == 7) {
    //            continue;
    //          }
    //          System.out.println(i);
    //        }
    //
    //    int[] arr = {1, 2, 3, 4, 5};
    //    for (int i : arr) {
    //      System.out.println(i);
    //    }
    //
    //        int[] scores = {1, 30, 20, 80, 15, 20, 30, 22};
    //        int sum = 0;
    //        for (int i : scores) {
    //          sum += i;
    //        }
    //        System.out.println("합계는 " + sum);
    //        System.out.println("평균은 " + (double) sum / scores.length);
    //
    //    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    //    for (String str : arr) {
    //      if (str.length() >= 5) System.out.println(str);
    //    }

    //     Daily Quiz
    //    int count = 1;
    //    while (true) {
    //      if (count == 10_000) {
    //        break;
    //      }
    //      count++;
    //    }
    //
    //    for (int i = 9; i >= 2; i--) {
    //      for (int j = 9; j >= 1; j--) {
    //        System.out.printf("%s x %s = %s\n", i, j, i * j);
    //      }
    //    }
    // --------------------------------------------실습 6--------------------------------
  }
}
