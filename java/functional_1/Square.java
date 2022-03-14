public List<Integer> square(List<Integer> nums) {
        //   nums.replaceAll(n -> n * n);
        // return nums;
        
        return nums.stream()
          .map(n -> n*n)
          .collect(Collectors.toList());
}
