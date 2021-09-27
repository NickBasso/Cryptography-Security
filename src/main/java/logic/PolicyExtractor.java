package logic;

public class PolicyExtractor {
    private String data = null;

    public PolicyExtractor(String data){
        this.data = data;
    }

    public String extractPolicyItems(){
//        StringBuilder data = new StringBuilder(this.data.trim());
//        StringBuilder result = new StringBuilder();
//        String pattern = "<custom_item>";
//        int len = pattern.length();
//
//        int from = data.indexOf(pattern, 0);
//        while (from != -1) {
//            int to = data.indexOf(pattern, from + len);
//
//            int i = 0;
//            while(i < to){
//                int j = 0;
//                if(data.charAt(j) == '#'){
//                    int k = j;
//                    while(j < to && data.charAt(j) != '.')
//                        j++;
//
//                    data.delete(k, j + 1);
//                }
//                else if( data.charAt(j) != ' '){
//                    String key = "\"";
//                    while(data.charAt(j) != ':')
//                        if(data.charAt(j) == ' ')
//                            j++;
//                        else
//                            key += data.charAt(j++);
//                }
//            }
//
//            from = data.indexOf(pattern, to + len + 1);
//        }
//
//        System.out.println(result.toString());
//
//        return result.toString();
        return data;
    }
}
