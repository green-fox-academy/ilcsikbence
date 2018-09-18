package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Hello;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  AtomicLong greetingCounter = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(@RequestParam(value = "name", defaultValue = " World")  String name, Model model) {
    model.addAttribute("name", name);
    model.addAttribute("id", greetingCounter.incrementAndGet());
    return "greeting";
  }

  @RequestMapping(value = "/web/hello-to-all")
  public String helloToAll(Model model) {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
        "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
        "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
        "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    Hello[] helloObjects = new Hello[hellos.length];
    for (int i = 0; i < hellos.length; i++) {
      helloObjects[i] = new Hello(hellos[i]);
      helloObjects[i].setColor((int)(0 + Math.random() * 255) + "," + (int)(0 + Math.random() * 255) + "," + (int)(0 + Math.random() * 255));
      helloObjects[i].setFontSize((int)(12 + Math.random() * 12) + "px");
    }

    model.addAttribute("helloObjects", helloObjects);

    return "hello-to-all";
  }
}
