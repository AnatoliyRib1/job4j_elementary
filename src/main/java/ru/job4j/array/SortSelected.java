package ru.job4j.array;

import ru.job4j.loop.FindLoop;
import ru.job4j.loop.SwitchArray;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, 0, data.length - 1);
            data = SwitchArray.swap(data, i, index);
        }
        return data;
    }
}
