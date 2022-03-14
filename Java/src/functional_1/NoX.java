//Given a list of strings, return a list where each string has all its "x" removed.
//
//        noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
//        noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
//        noX(["x"]) → [""]

public List<String> noX(List<String> strings) {
  
  // return strings.stream()
  //   .map(n -> n.replaceAll("x", ""))
  //   .collect(Collectors.toList());
  
  
  strings.replaceAll(n -> n.replaceAll("x", ""));
  return strings;
  }

