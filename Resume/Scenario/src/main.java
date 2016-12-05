/**
 * Created by turge on 003 03.10.16.
 */
public class main {
    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Городничийа", "Ляля", "Городнич"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. Городничий! И еще с секретным предписаньем.",
                "Городничийа: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Городнич: Господи боже! еще и с секретным предписаньем!"};
        System.out.println(printTextPerRole(roles, textLines));
    }

    /**
     * Метод группирует текст по ролям и располагает реплики в соответствующем порядке
     * с нумерацией
     * @param roles
     * @param textLines
     * @return
     */
    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] textRoles = new StringBuilder[roles.length];

        // Создание заголовков ролей для сценария
        for(int i = 0; i < textRoles.length; i++) {
            textRoles[i] = new StringBuilder("");
            textRoles[i].append(roles[i] + ":\n");
        }

        // Добавление текста к ролям
        for(int i = 0; i < textLines.length; i++) {
            int currentRole = 0;

            // Получение индекса роли в строке
            for(int j = 0; j < roles.length; j++)
                if(textLines[i].startsWith(roles[j] + ":") && textLines[i].indexOf(roles[j] + ":") == 0)
                    currentRole = j;

            // Добавление строки к роли
            textRoles[currentRole].append(i + 1);
            textLines[i] = textLines[i].replaceFirst(roles[currentRole] + ":", "");
            textRoles[currentRole].append(")" + textLines[i] + "\n");
        }

        // Склеивание всех реплик в сценарий
        StringBuilder scenario = new StringBuilder();
        for(int i = 0; i < roles.length; i++)
            scenario.append(textRoles[i] + "\n");

        return scenario.toString();
    }
}
