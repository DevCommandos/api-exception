# exception

## api exception 처리 방법에 대한 것을 간단하게 해본다.



### ResponseStatusExceptionResolver

---
@ResponseStatus
익셉션에 붙여주면 해당 익셉션 발생시 선언한 에러코드로 응답이 나간다.
또는 ResponseStatusException 을 터트린다.
ModelAndView를 return 하므로 api 서버와는 잘 맞지 않다.
---
### DefaultHandlerExceptionResolver

---
내부에서 에러가 발생하면 500에러를 return하는데 DefaultHandlerExceptionResolver가 
에러를 확인 후 특정 에러코드로 변환하여 내려준다. 

ex) TypeMismatchException => 400

---

### ExceptionHandlerExceptionResolver

---

주문 api 에러, 배송 api 에러 등 각 api에서 response가 세밀하게 다를 수 있다.
@ExceptionHandler 어노테이션을 달아 놓으면 ExceptionHandlerExceptionResolver가 작동한다.
하지만 각각 컨트롤러에 적용되므로 공통적으로 사용하기엔 무리가 있다.

---

### @AdviceController

---

컨트롤러에서 발생한 에러를 한 곳에서 처리할 수 있다.
특정 컨트롤러에서만 지정할 수 있다.












