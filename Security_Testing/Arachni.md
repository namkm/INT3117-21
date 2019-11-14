<h2>A.Khái quát về Arachni</h2></br>
Arachni là một công cụ mã nguồn mở được phát triển để cung cấp một môi trường thử nghiệm thâm nhập. Công cụ này có thể phát hiện các lỗ hổng bảo mật ứng dụng web khác nhau. Nó có thể phát hiện các lỗ hổng khác nhau như SQL Injection, XSS, Local File inclusion, remote file inclusion, unvalidated redirect và nhiều lỗ hổng khác.</br>
Download và cài đặt: https://www.arachni-scanner.com/download/</br>
<h2>B.Tutorial and demo test</h2></br>
https://www.youtube.com/watch?v=F84S_kaxpho&t=86s</br>
<h2>C.Kết quả</h2></br>
<img src="https://github.com/namkm/INT3117-21/blob/master/Security_Testing/arachni_1.png"></br>
<img src="https://github.com/namkm/INT3117-21/blob/master/Security_Testing/arachni_2.png"></br>
VULNERABILITY FOUND</br>
1. Missing "Stric-Transport-Security" header</br>
	Arachni discovered that the affected application is using HTTPS however does not use the HSTS header.</br>
2. Missing "X-Frame-Options" header</br>
  The server didn't return an X-Frame-Options header which means that this website could be at risk of a clickjacking attack.The X-Frame-Options HTTP response header can be used to indicate whether or not a browser should be allowed to render a page inside a frame or iframe. Sites can use this to avoid clickjacking attacks, by ensuring that their content is not embedded into other sites.</br>
3. Interesting response</br>
	The server responded with a non 200 (OK) nor 404 (Not Found) status code. This is a non-issue, however exotic HTTP response status codes can provide useful insights into the behavior of the web application and assist with the penetration test.</br>
4. Insecure cookie</br>
	Arachni discovered that a cookie was set by the server without the secure flag being set. Although the initial setting of this cookie was via an HTTPS connection, any HTTP link to the same server will result in the cookie being send in clear text.</br>
