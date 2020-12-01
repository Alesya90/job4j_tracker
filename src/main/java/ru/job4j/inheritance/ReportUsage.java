package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        HtmlReport report = new HtmlReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);

        JSONReport report2 = new JSONReport();
        String text2 = report2.generate("Report's name", "Report's body");
        System.out.println(text2);
    }
}
