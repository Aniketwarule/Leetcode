import java.util.*;
class Solution {
    public boolean isPathCrossing(String path) {
        int x=0;
        int y=0;
        List<List<Integer>> li = new ArrayList<>();
        li.add(Arrays.asList(x,y));
        for(int i=0;i<path.length();i++)
        {
            char ch=path.charAt(i);
            switch(ch)
            {
                case 'N':y++;
                break;
                case 'E':x++;
                break;
                case 'S':y--;
                break;
                case 'W':x--;
                break;
            }
            if(li.contains(Arrays.asList(x,y)))
            {
                return true;
            }
            li.add(Arrays.asList(x,y));
        }
        return false;
    }
}





