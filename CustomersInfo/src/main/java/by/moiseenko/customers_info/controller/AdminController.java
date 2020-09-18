package by.moiseenko.customers_info.controller;

import by.moiseenko.customers_info.entity.WindowsVersion;
import by.moiseenko.customers_info.repository.WindowsVersionRepository;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Default javadoc
 *
 * @author moiseenko-s
 */
@Controller
@Slf4j
public class AdminController {

  private final WindowsVersionRepository windowsVersionRepository;

  public AdminController(
      WindowsVersionRepository windowsVersionRepository) {
    this.windowsVersionRepository = windowsVersionRepository;
  }

  @GetMapping("/admin/windowsversion")
  public String editWindowsVersion(Model model) {
    List<WindowsVersion> windowsVersionList = StreamSupport
        .stream(windowsVersionRepository.findAll().spliterator(), false)
        .collect(Collectors.toList());
    model.addAttribute("windowsVersionList", windowsVersionList);
    model.addAttribute("windowsVersion", new WindowsVersion());
    model.addAttribute("localFormatter", DateTimeFormatter.ofPattern("dd.MM.yyyy"));

    return "admin/windowsversion";
  }

  @PostMapping("/addWindowsVersion")
  public String addWindowsVersion(WindowsVersion windowsVersion, BindingResult result,
      Model model) {
    windowsVersionRepository.save(windowsVersion);
    return "redirect:/admin/windowsversion";
  }
}
