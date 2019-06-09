<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">   		
  
<title>Worker Menu</title>

</head>
<body>
<div class="container">
	<div class="row">
		<div class="col">
	<font face="courier"> <br><h4>Hello, ${workerInSession.getName()} ${workerInSession.getSurname()}</h4></font>
	<a href="/login" class="btn btn-secondary">Close Session</a>
		</div>
		
		<div class="col">
			<img class="mb-4" src="https://vignette.wikia.nocookie.net/lostpedia/images/3/37/Oceanic_logo.gif/revision/latest?cb=20070916213045&path-prefix=es" alt="" height="125">
		</div>
	</div>
</div>               
<div class="container">

<div class="row">
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBxISEhUSEhMVFRUVFRcYFxUYFRUWFhgVFRUWFxcVFRUYHSggGBolGxcVITEhJSkrLi4uFx8zODMtNygtLisBCgoKDg0OGhAQGy0lHyUtLS0tLS0tLS0tLy0tLS0tLS8tLS0tLS8tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLS0tLf/AABEIALcBEwMBIgACEQEDEQH/xAAcAAAABwEBAAAAAAAAAAAAAAAAAgMEBQYHAQj/xABLEAACAQIDBQQFBwkFCAIDAAABAgMAEQQSIQUGMUFRImFxkQcTMoGxFCNCcqGywSQzUmJzgrPC8BU0kqLRFkNTdIPD4fFE0xclVP/EABkBAAMBAQEAAAAAAAAAAAAAAAECAwAEBf/EAC0RAAICAQMDAwIFBQAAAAAAAAABAhEDEiExIkFRBBNxYbEjMoGRoQUUwdHw/9oADAMBAAIRAxEAPwCzRx05SOixJTuJa6zmTBHHalfV04hQUoyUljUNVho6w0tajAUbAVbfNNI/3/gtQkadlfq/ian99uEf7/8ALULGOyv1fxNI+QojN5F/JpfAfeFabshfmIv2afdFZrvL/dpP3fvrWn7KHzMX7NPuiiFi+WjAUK7WActQy12u1gnMtdtQoVjBkS9Keqoi0qtKwoBWk2jpVjSbNQQWJFKbYn8V+8KdFqaYr8V+8tMKVDesflB+qvwqAK/lWC/5n+Rqnt6D+UN4L90VCRi+MwX7e/8AlNZGZqNcIroFGoiidq4Vo5rho2ahMiuZK6xrlEIlIgpB0pyVpNxRQGhnIlNpI6fPSElNYrSGBioUuVoUbEoUiWnKCkYBTlaRlKFYzSoJNJKKUVqVoaw+SjCuK1GBoGoq2+3+68H/AJah4x2V8BUxvt/uvB/5aiIvZX6opQojd5/7s/jH/EWtR2YvzUf7NPuisu3o/u7fXi/ipWp7PPzUf1F+6KJiqb371ywSfJ8PDncjVyTZSeFlA1PvrOdp7YxyEieaTMbHLm4Dlw4DurVcTCoxDEDja566A/jVA312TnmaTXtW014AAC39c6g8jcqOtYkoJ9x1uhv+0bpDiWzRsbBz7SX4E9V+FawvCvOeN2SYj2gVOnEW491bX6O8W0mAhLfRDID1VGKqfIW91UjKyGSNFirlqOTRDTkzt66HooNC9YIc3NFINGV6DNQMJ2ptivxX7wp2TTPFnUeK/EUWAp28n94b937oqJwo/LcF+1Y+S1K7wn8of937oqLwP9/wf1pD5BayMadXaFCiCgpFFIo5rlY24nauWo5opFGxQhpNhSpFEIohEGWkXWnL0i4pkBjYrXKUIrtEWgkdOEqL2FNmiQsdcoJqSTGwf8RfMVNyRShwtHFKwmMi4INJ4hwoLHgASfdS6kzONHHkC8TaoraO88EHt5u6wuT4Le5qFl2+M9jqx5clHIe6nWz9nrJmlOrN1HLoOgrnlmbfSdOPAu7Gu8m0o50hljJKkPxBBBBXQg8KaQ+yv1RTbakiAlQ3stYgXsGb6N+F9Kcw8F8B8KrGWpWSyQ0SojN6f7uf2kP8VK1LBfm0+ov3RWWb1f3f/qw/xkrVML7CfVX4CnEK1tPK2IurZWuQ2vEDThy1FdxUcZZC2uU3HTxNSe8GFj9UXKLcEa8L5iAbkWv7+lVFsYD2VYMfHhXJki1I9DHNSgq7EJvfBJKS9iFQBFJFiwQHtW5Akm1aju9hxHhoEHBYk+6CT53qq4jDq8eU63FOdmb0Lhlihxd1uyxpIBdQLWX1pv2Tpx4W42qmDe0R9T2ZdI0vTaZlkOS5UDnfj4UTE4m5yC4HAkGg2yYmtckkfrH/AFq8m0vqRxKMn1bL4sWiwwTgxPib0e1BFsLUTEzrGrO7BVUEsx0AA4k1kLKTk7D0KpeJ36JNsPBnHIsSC3goGnnfup3sffJZHEWIibDuxspbVGP6Oawse4+dDUroOiVXRaaZ4viPrD4U8pliz2l+t/KaLEKft3+8P4j7q1BnGpFioZS2sSuctibl8oFyOHs1N7a/Pv8AW/AUgNnpPEwADODqOd+l+tvjU5y0orihrdDLau+OKvdM2XqAiqPeVN/eaU2F6Q5A4XEglD9PKAV7zlABHuqLlwunqlDGS+i3F79Bc6VVMZjzqhFrGxFzcEcbngPcKmpso4LujfsJtSCU2jlRja9gRe3W3Th507rF91i4Qy5jZWAHdcrex4i/TurZMJLnRW/SUH3ka1XHk1WiOTHpDkVyj1y1UJUJmiEUq1GWHslyNBy60bNQ1IpFxUBitsYn1hCwMEvoSOXXSjYLa88kgQxFRzJvwHupsn4danyU9Nhn6iM5wW0eb2/a+SZIoUa1cokys7ubUCloSPoC3lrVQnAzPe97m1vGtpi2XADcIL9bUb+yYD9AeVR1ILhZisWLkT2WYeDGrvs/aTthypVmLKRmtfUgi9XP+x4P0F8hVW3+xhgi9XCMvZJNvIfjQlkUVwNHG2ymbvpHPIysTdQvA27RNte/nV7w5yrkubcL1ne7OD1kxSsMguJFsbqAuYP0K8b86t3r2sGjIdSL6Nfxsa5HFrc9HG4tUR+J+TxfKEyZ07MjdfWfRKjqAAa7D7K+A+FJ4naUNnRlfOw1FvcNeFvfR4T2V8B8Kthujn9TVqiL3p/MD9tB/FStIXaSqFBv7I+FZvvR+ZX9vD/FWtdXAAhdL6D4Va6OZKyA2tvPhsPHnmawPBOLt3KnPx4VR13xOLlabKkGGhGUByuaSVypALciEDHKDbtC5PKl734wy43EMToJXRe5I2KKB7lv4k1J42BItl4RQLyTFpiTyBBN/HWNfAGnjFT2ZrcdzTsDArqsgsVYApbUEHg2nGsu392qJsQ0a6xxdnTUF72Y+fZ9x61cN4ceuzMCsMNxJICEubsCdZJTfhqeWlyNNKygSGxUHQkE95F7fE+dZpQWmIXJzeplv3a35lgtHiA08PD2rSqP1W4N4N5itW3f2hgp09bhpC1rZlJYOpPJkPDx4HrXnsUtsva8uFmWaE2ZTqL6Mt9Ubqp/81NpN2ykcs4xcE9vB6XWYWqi+lrHuMIiKCA8yhtD7IViL92bL5Crxsx0nhinj9iWNJF65XUML99jURvWsKCMTEASZl19k2AYg9PZ+yklPYEIdSsqu6+EGGw4kkGZ2F+pAtcDy6U03k2hE0CyNdVkHYJA1sL3BB063qekkCRHS44LbQe88h41Xt6sciiBGQEq48CCuVgAbHma5E7Z6TjS2NF2TjM0ELuRmaNCT1JUEmi4yQFlI/S/kaibt4G+FhLi10Fh0T6H+XLTPbc6xMF4AN/IxrujKzypRplf2sfnn+t+Ap9syOMEMurBbE62Jvf32qLxUuZyw5m/nXNn4pEd8zKvYUi9rnV+HO3DzFTzLpL+maU6fcfY5Y42acjtCzGwuxsbhVA5lreVZJtiFzIzsuUs5YjhqxvatLO2IiGkZwEQ2vxu3IADie4VQdt44YiZewY0Lqva0axNrleVRxRk7dHTnlGqsn93ZQIEh5sb+Pa/8VqO7s14FvyLD3Zjasnkljzj1bDNcZUGjWFtLc/dzBrV91IWGHU9bmmxupHNk3iSl6Bo4Rr8KUAtd3sFGp91dCmc+kLBAD2m0UfbUJt58U7fMSoiD6OW5J6k/hSW3ttYKdcjT2QcgSt7dbDhTXZ+7UEgEkTuV5G5t4i9dUY6Fqnz4a/2czl7slCLVd2pb/wPtjY0KlsRIrSX14DyFH2htSFbWt7qi59x4zc52v7qd/2EgygDsqLWriWSTlclR6/qMHpseNLBNyf1Cna0XWu0jiNigsSLAUKr7kTh0stbbRQG1LQYtW5cr1w4NelJTR5RfpU9htxTaO04cPE00zBI0F2Y+NgABqSTYADU3rHt/wDfrDTspw2d+yQSylFGunHU+VH9MW2Cwiwwf6XrGUdALLm8zp3VlxNZxTW4VJrg1bcTaGHiwS+ukiQytIWDOik9oqLgm9rCqfjsQcHIXw0/zbFsrI4ZCBbxB0I4i+lVm/OnMTLYkgngRaw58Tf3VdZKWmtgY8blPmnvu+3kmNk7S9bifW4ibKvq3zNbTRbqMo4620qybL3lgkZYswzGwUi+Vu7UAq3cR7zVf2NglnhxMkgHbVY1PMMtu1bhxEZ/dNViMmNwSLMrAkdCp1+FHJGknVWTUrk1d0advKfm4/8AmIf4grbIsQth4CsR3jPYi/5iH71aJtHbGSF2vbLGx8lJqMh0YBtGUPNKw+lLI3+J2P41Ycdi0P8AZ0bGyx4aAueQDkZvJVvVSi4Cu/KCbljwAX91AFH2KKpjdAkrJneLa7YzEPKSFB0RWNssYOg8eJPeTUVJGV429xBqe3LxWHX1oxOKlw6tlsqIJFe4YNnUxuNBl10Opom+r4bNH8lnWZcrEkQxwlT2coORFJ0vx6d9LqX6jaZc9iBDXpKSjQ+yKSnOl+hpTHpD0Zux2bhLnQRADwUlfwqc25suHEwtHOOx7Wa+UqV1DhuVvhe+lZBsr0rx4LBYbCwweukSFM7M+WNXa7MtgCWIv3cxyqF2zv3jtoKUkkSKC4zoilVYE6KxJZnJsdL2NjcWpVFtjXRdMJvBhsgb1qFealgGBXQkA+0L8xVf21trATYmANiW9UJBmIzOqA6XAJsOevLjVVwey0kkMb4hIQAxLOLqCqhmF7ix9r/DUXtNos2WFmeNeDlMmY8yAdbcOP2UHgUJNPkr/cNx6eD1hCFyrktlsMttRltpY9LWrK/SXjssxUH6X/bNUrdX0iY3BIsSlZYV9mOQHsj9FHBBUdxuByFE3j3i+XStMFyEnVL5rdm2hsLjQ8qKVEHuWzBNeOM9Y1+6KcbtyKu0kd/YTCTMx42UG508BTTBfm4/2a/dFRW1tpfJnmkt7WDaFTbTPMzL9i5j7qdK9hQbY3iON2mmUgRgPHEpXKFAzEE5SczEXJ4W4VH7Yx+Gw90gyzTknPObMsZPFYl4A9/LqeVTsyObNqFtmHHtDtWPUjS/eaJkA5UZS1bL8vgfQ8bakupbX4+B+m1SZEeQF1VlLWyhmUG5AYg2J6kVvu4WIEkR9W+eLRkbnlbkw5NyPeprzi6n+jWo+gfbWWeXBudJE9Yh/Wj9tfepv+6ak4oKkbOsPMnSq5tfb73KLhpHQaXsAG9x5U523iMWzWgMQQfpXJJ93AVDS/2iPpQeR/0rqw4oreTX6tnHnyyfTFS/RJ/caNtFGNnwDgdSin8KNHvVNGMq4chRw9oaeVWrZzqI19Yyl7do8NfClyIj0rn9RJ5H0ul+/wBz1fQvFgh+Ni1N93t9iF2DtiXEls0WRQONzx6cKlWjp5BCoHZFr0dhUlF1u7FzzhOblCOleCLsKFSBShRoiV3/AGiPRvI1A7277/J4Tp844sinn1Y9wq4bXxcGFieaayoi3PU9FUcyTYAdTXnDePbcmLneeTQsdFHBEHsoO4deZJPOqExli8U0js7sWZjck8yaRvR4I2dlRFLOxCqqi5ZibAAdb0jjMPLFO8MqlXiZlZTyZTY+PjzohFaPhyQ19DobA8L8qIDQY1mPjnompeHZJbHxzp64NxAvl5aEKSB3XHupksgE6FiuVjZi650APEsvG3PQg9KZCSzZgdefw+FOJlBjLk217Peb/wDsVb3V7Wl9uBFgllzSnD6t34Xl/wDbmi7Z/N4cXU3nh1U5lPercxV43+RIdnYl+BMWQfWltGPvVlewcX6zDYZeaYtE91yw+xh5Vo/p4nC4GOLUGWdeHC0asxufErUGBGIRHQ0mBcnpe/vo2H4HxrpTy/rjTBAZKTlalDSb2H9a1jCyeyPCkJTo1Kg9keFNpm9rwoMwng9Sal8jRgDUD2ie8cPLh51FbPHE99SZjLuFViQVJOYk2tYc6aEtLsvi9Os0JVbltSX17/F+OA0GFaYxxqCS7nkza2Zr2AJOgJ0HKpPae6c8EfrZCoUC+qzIeNrWkjWxvYC9r3qPXaLRsvyeRl9Xe0imxLkWJBHKxI99K7U3mxk0XqZsQ8kZIOVrHVTca2vx191ac9bsnPFHE9Cdtc+L+SLL/wClK4GS0gB4G49/L+u+mkAvr/X9caNIba9NftpRDVxJkiDHgsYP+Fb1nO0dqSS/OSKDcjKtzYH8QOHvq+bVfLhZCOIgbzyVm4HC/EfGnUqi0aGz1VdftZM7vQRPf1kwSUnTMAUYW1DX0t3CxFhaoiWQFtAAOQF7eIzG/nSbPSLNSBlLVv3HVOtkY31E8c1mOQ6hWytlYFWCtyOUmmMT3qV2RsKbEk+qXQcXOij38z3Cjq07g0aumjb9mbBixMSzYbGyvG4uCJL+KsOTDgQdRTyHdSRb/lMhuOZ4VSPR7NNs95MOxV0k7YGotIoANr8bqBf6gq7tvTbjGfMUJ+udaXLn6F/Tf0mepZMcN0/Pf4bGZ3HN9J294FGg3MdWUmdiAQSOoHLjTgb1j/ht9n+tTex8d65c+UqOhteuRRwyex7Gb1f9SxQvI6XxEeqLC1cZqErWBpkMSxHCrpHhtjrPQpkcU36NCjpYLMf9K28YxHq442VkzsxIN9VACj/Mx/8AVZwyd9a1idzsNIuX5RL7yrWPW1ZjtXAPh5WicaqeI4MOTL3GnERevRJsYAtjyyM8TZEj5oSO07X4EqbDuJ9yHpfwNsUuJy5fXLla3N4wACe8qVH7lUzZ2NaIkhQb2uCAeHu8asO1YhPgzPHLE3qyrPHqsqZjk1U6WueI0NtKxiqMaSYmlRrRCO+sYSVaSxDn2b6DUDx4/CnTGmsw+FAZSaJ3c3FfOJH1xELgeGcH+WtL9PO0CfksP7WQ/wCRF+L1kO7UuXERsBcg3XxAuL+VWDfjbkuMxOeUBWVFTKNALFm4XOva61gEOBYAUCaIx4eNdpjANJSd1HNcU6igYUemUwJJA508em0Iu9CToMVbFNnjKbMDx4ddOVLY1yCwtlJABA5IBe1+pJ+ynU2GzJoQCAza88qlreJtUeVJN2JOnwpU7OmOb28bguW+duKr5+NwyMALDhScrV0aDqaTI8+lMcpIbB2VNiSywxlyLXtYAA8LsSAOdOds7vTwCzhbkHQNc1bvQ/7OIH6yfdai7/SdvKOQY/YbVF5Hqo6Vijo1MlGhDx5GGjIAQD1GovVA3liRMS6oAAAgsOAOUH8QffWij8Ky/aWI9ZLJJ+lIxH1QbL/lAq7OVN1XYZnWisKUtSb6CgFBGe3DTlWv7lxyrgMM7pZZAwUjnlYjMw5FgL99ZNsvZ0mJkEcYuTxPJR+kTW1JKI0RSbLGoRF5KqgAAeVQzNVR2emi71DLbTNGyypoyMGHiDfyrRsLtzDSRJKcoDorWNtLi5B8DpWYbQxhmYRRqWYngOnU9B30pFu1jSoUWCgcOlLB0uC0oqT/ADUaM28GCHEr5Cgm82Ht2NR3CqPhtxMQ3tyhR3C58zVm2buukShcxNUV+CGZQS2lY8l3oj4ZGPuppJvEg1tYcr6VIrs6MDhVU3s2dhnQh5MvqzfQ21OgvTWc6g3wS3+0CnXTzFCs/wAVsjDIxX5Swtb6R6A0KVZU+/8AAKfgVhxffTPbeATFKADaRfYb+U9x+yrqm7kPSl4t3oQQcuoqlgowvF4Z4mMcilWXiD8R1HfQwJYSJlBJLKMo+kMynJbmDYVtW8m5+Hxi69iRRZZQNR+qw+kvceptaslwu0H2bi5EaJJZI7pfMbA8SVNuYt3jWs3aClvuW9d0cPnaZlYksWEZJEYJJNiEGYr3XqJx+EncPHCmAZSCCsKoJFvy7diD302xG/EkpyyRBE6xuwkU8mVu7pUZtXHCS4kyTta8c4ukg6CVQLEjp4a1KKl3LylCtiInQglSLFbgjoQbEU1k5HvpaU8hScw0Hj+FWOYNsbEernjktf1citYcwrAke8XqW3h2mcViJcRly+tkzZQSbAWAFzxsABUHhjZj/XGn6kWrIzE5D2kHeT5D/wA0tTZXzPccFFqcUTANCPj7q4aNHWACU07hwP5Osn0ml8kIKj7R9tMsWdNNNK1/dDdyKXCsjAXKZVPRgOy3uYA+6hJDRe5TtubCEUHrLE9m1uWY2AY93H7Kpz8P656Vt0mEEsBjcagFGXoQLEedY1j8OY3eNuKNbyOh8rGpYpWqZfPCmmhGi5e77aUzU+2Fs44meOEcGbtHog1Y+WniRVW6OdK3SLx6NdmvBDJiX0Etsi/qrftnxv5AdarO38cz4hzccbC65hYcdK0DefHLBDlWwAFgB5AVlUr5nB43/E61zw6pNnXl6IKKJ1osevQ+9/weoPYGEaRtMOcQMuq5mQAm2pccOeh61oznQ1nGxMeY8qkFkJBEbSMkQc5RnlA9oADUd3dXQ1scsWm9y3T7jrKgeJZIGOhiYrLr3FTqD4+6m2zdxhncTHMUbKVykIDYG5N+1oRpoPGpTB7+4aMCMq/ZGkkcaqgYfoIWvYcuN6r2I36bthczBnZrlALluuvZHuNR62jpvGpWXMLDh8xULmY3YgAXPU2091QG1Nt6/SPeFLW8qomM2xPKbvIe4DQD3CvQmw1w2Lw0M5ghPrI1Y/Npo1rMOHJgRQWKt2aWftEouxd94MMuVcLqfadmkzMe8+rPkNKmovSnBzhI8HJ+KCrQ27uDP/xovcij4U0xO6uA+lCo8HkX7rCqkHZFp6UcIeKyecf4uKeQb/4VuAk8kP3XNIvuls48FI/6rn7xNJPuFhDqDIPAofihrAJEb7YM/Tcf9KQ/AGorF4vZ00pleXjbRo5ANOHFaTk3Ch5Sye8Rn+UU3fcS3sYhh+4fwcVtgptcCBwWB/8A64/Mf6Vyl/8AZPED/wCX/kf/AOyhQ0xLf3GXyMsBvPNKzICAQL+NPsDvLMHyFcxI4VJbI3FhikD5nJ7+Hwqel3YgZ1ktZhwIqksqo5lHcLu/ilnUmQlGU2IvasJ3thZMbiA4sTNIwva5RpGKsO4i1bzjN2leMorshJuWFr/aO6sW9IWAWDGvEGLZUjuTxuVDH41OLsLKzXHajFR0opjFOKJWpKdwbAcqO4vwGlJlKwaOvCylSRYOuZT1FyPiDSzxkpmHDMFPvUlfPK/lVmwmGhbDYRpvZVnB1IOQydoC2pNhpU3tjdNjs58TEABCYi6hACVVXztfnl9YpJ6KaF06H07WZ/GLWpcmkD3fjXDLYa6+FEQWo6GkFlvy+0VrmxYsOmEiikRT2AWDKDdmXMx8yaWUqKY8Tm2ZLPfkLngBxuTwFudalun/AGhJKXgRUisrBHawIYA6EA8ePvplsfYmHl2zhI4kIjs07WLD80rOhHQZwlbLhdnxkkqALaWGgAHKw5UksjtJLkzhVplM2nijDiYUmUI+JDgWNwzRBdT0NmA77Vn3pI2I6yfKES6kWe2pBHBrdLaX7hVh9OMvq8TgvVmzRpI4PQmSPKfNKlsBtaLFQLKpAuLMD9F+anvv50JLS9SLY3rWhmIiQVovo02dkjfFv9K6Rn9UHtEeLAD92nGM3Eiml9aJDGhN3RQNTxupPs3HEWNRe9W258GgwyjMhDASkWC9FW3PiSD10rSlqVIMMWi5SfBEb87f9bIUU/8AgdfGoXZRvlHQgfaKj1F9TqTxNSWxBdh9dfjVIx0qiGSWrc08C5t/XWssxhtJIALWdxboAxA+ytTDhbseoUfWcgD41mW09ZpTz9Y32G1BO5MLjWNMZXojLalHWkmNOSQmwrYvRJj5jgmjVQRFM4FzyYK9vNmrHTW7eiHAepwAZhrPI0o+pZUTzCZv3qDGJ2V8Uw0CiozE7HxT6swPdVsuKAoKbXAdKZR5NgYgf+zXG+WoLAGwq8FjRC3UUfefcHtoqeExMn+8D1Ix46LmTUu6g8qbyYdT9EeVBysKi0Nxjo+ooUU4Vf0KFLsbclYscMxVwU0uL8+6nSYgXtY+I1FQo2dJKytJJdR9G1tOhNSaxlCqxkKOJHHStQNyRym17GvO/pKlzbUxR/XQeUMYr0JDI1iSb9K84b9S5toYon/jMP8ADZfwpogZB1x66KK1MKIk0Wuk1ysOi77tRLINnxN7Lzurdbdo3HQ6Vvkmz4vUthQvzbRshH6rgg36k3NYJuWby7OHTFP8G/1r0FiRcW/SNr0skZN8Hk6aIozIeKMVPipIP2ikHqxb97P+T7QxUXISlh9WQCQff+yq89MBBozVkG+EgXtICwKkEaL2bixXloeVVqLhQeg4p8jxm4vY1L0LyvicdLO2nqcN6tRbh6xxYE89EatsjjA14E1kvoAw5WHFS8mlRP8AAmY/fFapDGxYsTpfQUoG7Mh9PeHIxGGk5NC6jxjcE/ZIKznZG1Gw7l1AYMpVka+Vgeo525Vrfp7X5jDHpMw84yf5axZqZcAunaLx/wDkFdVyOASdQBcAcBx1uefLvqq7ybV+VSC1/VoLC+hJ5m3KmBojGlUEmPLLKSpiTACpTYCdpT1dfvCoqQ1YNiRWMQ70Pm16cm+C27RxhjkgGRnVpCWC6G1sotfn7X+GqHjPzj/XfjxtmNr99q0g1mcx1J7zQqgudpIRekWpRzSLGiBE1uZsFsfjIsMNFYkuRyjQXc+NtB3sK9MRbKygKAAqgAAcAALADutWNehnGR4Rp8TIjsWURIVW9hfNJr3/ADflWn4PfpZpkhjiftm2ZrADS97ceVajNkz/AGf30PkHfUnauWoUayO+Rd5oHBDvqQK0UitSNbI1sCOpojYEdTUkRRCK1IFsjDgR1NCpC1CtsG2R+DPZHhSq+17jVS2BOXuyS54Wi7JB1R14g9PCoz+25Viw8kcuaViQUPBhexFuRpQ2aIns+deZ955M2MxJ64mb+K1b9DtJpZPUr2SqZn7ib2H2GqFtX0UPJMXixACyMzHOmYhmJYi6kXGvTzooDMtFFarPvZubLgEzvLHIoIByZgwubAkEde+qp6y/WimmGUJRq0FNFtTnAYYyuEBtoSSdbAd1WrC7pRAgu7P3aKPs1+2iC6FNxwRPs+4I/KXOotpl4jur0LiBw8axHZ8YGO2eiiwEpAHQBbAVtxNCRluYh6csDkx0cvKWAf4omIP2MlZs9bN6e4l9XhXt2hJIoP6pVSR5qtYxIayCCHhXXokNGkNExtvoBf8AJMSvTEA+cSD+WtUTgKyn0AJ+S4puRnA8ol/1FauvAUgTMPTyPybD/wDMf9qSsTatw9OYvhI+6ZfuuKw5qZCgNJNSjUiaIRxsnB+vxEMOvzssaG3GzuFJ8iasmET55bcMyfeNE9FeB9btOE8og8p8EQ2/zlKXwQ+dXxT4mh3NLgscr2Uk8gT5Cs0Y1oG2JMsEh/UI97aD41njmmEQm5pJONGlNFWgURvfo/wCps3D6fnFaQ35l3Yj/LlHuqbweCT5TCwABDH7ppDdyPLgsIvTDQ/w1p/hJAJkJNgL/CmXBJ8lpxM6opZuApvgcekoJXlUVvFjQY1VT7ZHlzpoHEEiMh+bcWbx5GgkqM5Oy0k0QtUZtLGfMs6NrbQ1DHETumdpMgUWsBqT33rJWFstDNRC1UyLacs4yM5jVBd2HtHoBSUG8Pyd2WR2aMLcMR2vDTjR0g1F1zVys8xG9kzsWiNkPsggXt30K2hm1Iid3U+T4iX1WYxSRE200flpQlwJmhw8aqUnjVe1cCxB11HGhQqQxaTE+GlGItnSSMLILgMrLezC/Eamp7Z2PDgWBtbnQoVg9ylel6ADCSSWH0AfEutqw/PQoUYopKcpVfbYmd2V1Z/BfsLH4irqr0KFOiLC4CT/APYYH9q3wFantjaJju/K1h41yhSTHgZX6VsVLLFAzm4WRxbTiy3H2IazMtehQpMX5Tr9ZXu7Ktl9jiNqfGjMa5Qqhym4egon5HIF4eufN9fJGPu5K0LY8shzZzwY24cL6UKFSrqOly6HsuEUL03Zjh16BlJ88o+NYk3Lx/ChQqke5CfC+P8ALOFqSJrlCmFNA9EMbq+JmS1/ViMHmAxLNb/CtMcCfnV8V+JoUKlF9Ui+dJYsdLz9xTe3E2iVR9N9fBRm+OWqazUKFVOWI3dta4x0PgaFCgOelcHJlggHSCIeUa0aIZ5FHcaFCnXBC9yL2hiCJ8g7WQeHHxpTFbUkyhfV9ldb3W/lehQo6VRtTsfwbRD4QuL6X08DXdmziaAX0vf412hS6UlQyk2yJ2IwaTEKSbXA8r0x2jh42xQha5VksevAmuUKbuDsV3GIYXaJB2UNhz05a12hQooB/9k=" alt="Card image cap">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of Workers</h5>
	   		<p class="card-text">List of your colleagues</p>
	    <a href="/LoadWorkersList" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://www.flyedelweiss.com/SiteCollectionImages/Press-Photos/Edelweiss_CabinCrew.jpg?RenditionId=22">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of Flights</h5>
	   		<p class="card-text">All flights Available</p>
	    <a href="/LoadFlightsList" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://thehungryguest.com/wp-content/uploads/2018/03/food_and_drink_masthead2.jpg">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of Cabin Crew Flight 4 Workers</h5>
	   		<p class="card-text">Groups of Four Workers</p>
	    <a href="/cabinCrewFlight4Workers" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
</div>

<div class="row">
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://www.aerosieger.de/images/news_picupload/pic_sid7146-0-norm.jpg" alt="Card image cap">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of airplanes</h5>
	   		<p class="card-text">Show all the airplanes</p>
	    <a href="/LoadAirplanesList" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://eodgoxn58m-flywheel.netdna-ssl.com/wp-content/uploads/2016/07/267784_288348997933099_337766240_n.jpg">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of Cabin Crew Flight 6 Workers</h5>
	   		<p class="card-text">Groups of Six Workers</p>
	    <a href="/cabinCrewFlight6Workers" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://amp.insider.com/images/5981e5ba232dfa2d008b48ac-750-563.jpg">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of Airports</h5>
	   		<p class="card-text">airports and it's cities</p>
	    <a href="/airportsList" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
</div>
<div class="row">
	<div class="col" align="center">
	<div class="card" style="width: 18rem;">
	  	<img class="card-img-top" width="286" height="180" src="https://ih0.redbubble.net/image.10770212.3748/flat,550x550,075,f.jpg" alt="Card image cap">
	  	<div class="card-body">
	  		  <h5 class="card-title">List of Airports</h5>
	   		<p class="card-text">List of airports available</p>
	    <a href="/airportsList" class="btn btn-dark">Add</a>
	  	</div>
	</div>
	</div>
</div>
</div>
<script src="js/bootstrap.min.js"></script>  
</body>
</html>