class Solution {
    public int romanToInt(String s) {
        if(s.length()==0)return 0;
        int total=0;
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length()-1;i++)
        {
            char a=s.charAt(i);
            char b=s.charAt(i+1);
            if(map.containsKey(a))
            {
                int y=map.get(a);
                int z=map.get(b);
                if(y<z)
                {
                    total-=y;
                }
                else
                {
                    total+=y;
                }
            }
        }
        char ch=s.charAt(s.length()-1);
        int kr=map.get(ch);
        return total+kr;
    }
}