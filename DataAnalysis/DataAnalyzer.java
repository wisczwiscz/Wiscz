package DataAnalysis;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class DataAnalyzer {
    
    /**
     * 计算平均值
     * @param numbers 数字列表
     * @return 平均值
     */
    public static double calculateMean(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("输入列表不能为空");
        }
        return numbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    /**
     * 计算中位数
     * @param numbers 数字列表
     * @return 中位数
     */
    public static double calculateMedian(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("输入列表不能为空");
        }
        List<Double> sortedNumbers = new ArrayList<>(numbers);
        Collections.sort(sortedNumbers);
        int size = sortedNumbers.size();
        if (size % 2 == 0) {
            return (sortedNumbers.get(size/2 - 1) + sortedNumbers.get(size/2)) / 2.0;
        } else {
            return sortedNumbers.get(size/2);
        }
    }

    /**
     * 计算标准差
     * @param numbers 数字列表
     * @return 标准差
     */
    public static double calculateStandardDeviation(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("输入列表不能为空");
        }
        double mean = calculateMean(numbers);
        double variance = numbers.stream()
                .mapToDouble(num -> Math.pow(num - mean, 2))
                .average()
                .orElse(0.0);
        return Math.sqrt(variance);
    }

    /**
     * 计算最大值
     * @param numbers 数字列表
     * @return 最大值
     */
    public static double findMax(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("输入列表不能为空");
        }
        return Collections.max(numbers);
    }

    /**
     * 计算最小值
     * @param numbers 数字列表
     * @return 最小值
     */
    public static double findMin(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("输入列表不能为空");
        }
        return Collections.min(numbers);
    }

    /**
     * 计算数据范围
     * @param numbers 数字列表
     * @return 数据范围（最大值-最小值）
     */
    public static double calculateRange(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("输入列表不能为空");
        }
        return findMax(numbers) - findMin(numbers);
    }
} 