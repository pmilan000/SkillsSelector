package org.launchcode.SkillsTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping("skills/home")
    public static String titlePage () {
        String html = "<html><h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list:</h2>" +
                "<ol>" +
                "<li>Python</li>" +
                "<li>Java</li>" +
                "<li>C++</li>" +
                "</ol></html>";
        return html;
    }
    @GetMapping("form")
    public String progLangSelector () {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action=''>" +
                        "<label>Name:</label><br/>" +
                        "<input type = 'text' name='name'/><br/>" +
                        "<label>My favorite language:</label><br/>" +
                        "<select name='lang1'>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C++'>C++</option>" +
                        "</select><br/>" +
                        "<label>My second favorite language:</label><br/>" +
                        "<select name='lang2'>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C++'>C++</option>" +
                        "</select><br/>" +
                        "<label>My third favorite language:</label><br/>" +
                        "<select name='lang3'/>" +
                        "<option value='Python'>Python</option>" +
                        "<option value='Java'>Java</option>" +
                        "<option value='C++'>C++</option>" +
                        "</select><br/>" +
                        "<div><input style='border: 1px black solid' type='submit' value='Rank your options!'/></div>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping(value="/form")
    public String languagesSelected(@RequestParam String name, String lang1, String lang2, String lang3 ){
        String html = "<h1>" + name + "</h1>" +
                "<ol><h2>" +
                "<li>" + lang1 + "</li>" +
                "<li>" + lang2 + "</li>" +
                "<li>" + lang3 + "</li>" +
                "</ol> <div><a href='/form'>Return to form.</a></div></h2>";
        return html;
    }

}
