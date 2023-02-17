import java.util.Stack;

/**
 * Задача:
 * Найти валидные круглые скобки.
 * Обязательно счетчик и правильные скобки нужно выводить.
 */
public class BracketСounter {

    public String counter(String string) {
        long count = 0;
        if (string == null || string.equals("")) {
            return String.valueOf(count);
        }
        Stack<Integer> stack = new Stack();
        StringBuilder res = new StringBuilder();
        char[] bracket = string.toCharArray();
        for (int i = 0; i < bracket.length; i++) {
            if (bracket[i] == ')' && !stack.isEmpty()) {
                count = count + 2;
                stack.pop();
            } else if (bracket[i] == '(') {
                stack.push(i);
            } else {
                bracket[i] = ' ';
            }
        }
        if (count == 0) {
            return String.valueOf(count);
        }
        //Удаляем одиночные открывающиеся скобки
        while (!stack.isEmpty()) {
            bracket[stack.pop()] = ' ';
        }
        for (char brack : bracket) {
            if (brack != ' ') {
                res.append(brack);
            }
        }
        return count + " - " + res.toString();
    }
}
