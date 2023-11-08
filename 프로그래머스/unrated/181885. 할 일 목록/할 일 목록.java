import java.util.ArrayList;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<todo_list.length; i++){
            if(!finished[i]) {
                list.add(todo_list[i]);
            }
        }

        answer = new String[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}