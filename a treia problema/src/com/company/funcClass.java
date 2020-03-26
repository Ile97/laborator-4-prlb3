package com.company;
import java.util.Arrays;
import java.util.Scanner;


public class funcClass{
    int[] a;
    int[] b;
    int m;
    int temp;
    Scanner c;

    public funcClass() {
        this.c = new Scanner(System.in);
    }

    public void setArray(int[] a, int[] b, int m) {
        for(int i = 0; i < m; ++i) {
            int j = i + 1;
            System.out.print("a[" + j + "]=");
            a[i] = b[i] = this.c.nextInt();
        }

    }

    public void getArray(int[] b, int m) {
        for(int i = 0; i < m; ++i) {
            int j = i + 1;
            System.out.println("a[" + j + "]=" + b[i]);
        }

    }

    public void reset(int[] a, int[] b, int m) {
        for(int i = 0; i < m; ++i) {
            b[i] = a[i];
        }

        this.getArray(b, m);
    }

    public void insertion(int[] b, int m) {
        for(int i = 1; i < m; ++i) {
            this.temp = b[i];

            int j;
            for(j = i - 1; j >= 0 && b[j] > this.temp; --j) {
                b[j + 1] = b[j];
            }

            b[j + 1] = this.temp;
        }

        this.getArray(b, m);
    }

    public void binary(int[] b, int m) {
        for(int i = 1; i < m; ++i) {
            this.temp = b[i];
            int j = Math.abs(Arrays.binarySearch(b, 0, i, this.temp) + 1);
            System.arraycopy(b, j, b, j + 1, i - j);
            b[j] = this.temp;
        }

        this.getArray(b, m);
    }

    public void selection(int[] b, int m) {
        for(int i = 0; i < m - 1; ++i) {
            int min_idx = i;

            int j;
            for(j = i + 1; j < m; ++j) {
                if (b[j] < b[min_idx]) {
                    min_idx = j;
                }
            }

            j = b[min_idx];
            b[min_idx] = b[i];
            b[i] = j;
        }

        this.getArray(b, m);
    }

    public void bubble(int[] b, int m) {
        for(int i = 0; i < m - 1; ++i) {
            for(int j = 0; j < m - i - 1; ++j) {
                if (b[j] > b[j + 1]) {
                    this.temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = this.temp;
                }
            }
        }

        this.getArray(b, m);
    }

    public void shake(int[] b, int m) {
        for(int i = 0; i < m / 2; ++i) {
            boolean swapped = false;

            int j;
            for(j = i; j < m - i - 1; ++j) {
                if (b[j] > b[j + 1]) {
                    this.temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = this.temp;
                }
            }

            for(j = m - 2 - i; j > i; --j) {
                if (b[j] < b[j - 1]) {
                    this.temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = this.temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        this.getArray(b, m);
    }
}

