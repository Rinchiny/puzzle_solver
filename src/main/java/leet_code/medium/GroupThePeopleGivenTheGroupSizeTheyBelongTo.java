package leet_code.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class provides solution for a puzzle described <a href="https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description/">here</a>
 */
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {

  public List<List<Integer>> groupThePeople(int[] groupSizes) {
    var result = new ArrayList<List<Integer>>();
    var activeGroups = new HashMap<Integer, List<Integer>>();

    for (int i = 0; i < groupSizes.length; i++) {
      var groupSize = groupSizes[i];
      if (groupSize == 1) {
        result.add(List.of(i));
        continue;
      }

      var group = activeGroups.computeIfAbsent(groupSize, __ -> new ArrayList<>(groupSize));
      group.add(i);
      if (group.size() == groupSize) {
          result.add(group);
          activeGroups.remove(groupSize);
      }
    }

    return result;
  }
}
