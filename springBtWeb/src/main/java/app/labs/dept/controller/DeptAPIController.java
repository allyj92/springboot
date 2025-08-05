package app.labs.dept.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import app.labs.dept.model.Dept;
import app.labs.dept.service.DeptService;
import lombok.extern.slf4j.Slf4j;



@Slf4j
@Controller // URI 규칙, Resource 위주로 서비스
@RequestMapping("api/depts") // uri 소문자로 계층형, 자원명을 복수형 명사로 지정
public class DeptAPIController {

	@Autowired DeptService deptService;

	@GetMapping({"", "/", "/list"})
	public String list(Model model){
		model.addAttribute("deptList", deptService.getDeptList());
		model.addAttribute("dept", new Dept()); // 신규 폼 바인딩
		return "dept/list";
	}

	@GetMapping("/list/{deptno}")
	public String detail(@PathVariable int deptno, Model model){
		model.addAttribute("deptList", deptService.getDeptList());
		model.addAttribute("dept", deptService.getDeptInfo(deptno));
		return "dept/list";
	}

	@PostMapping("/insert")
	public String insert(Dept dept, RedirectAttributes ra){
		deptService.insertDept(dept);
		ra.addFlashAttribute("message", dept.getDeptNo()+"번 부서 등록");
		return "redirect:/dept/list";
	}

	@PostMapping("/update")
	public String update(Dept dept, RedirectAttributes ra){
		deptService.updateDept(dept);
		ra.addFlashAttribute("message", dept.getDeptNo()+"번 부서 수정");
		return "redirect:/dept/list/"+dept.getDeptNo();
	}

	@PostMapping("/delete")
	public String delete(@RequestParam int deptNo, RedirectAttributes ra){
		int cnt = deptService.deleteDept(deptNo);
		ra.addFlashAttribute("message", cnt>0 ? deptNo+"번 부서 삭제" : "부서번호가 잘못되었습니다.");
		return "redirect:/dept/list";
	}
}
