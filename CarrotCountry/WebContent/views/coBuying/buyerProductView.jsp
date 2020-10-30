<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>

        /* 전체 틀 */
       .wrap{width:1200px;height:2000px;margin:auto;}
       #content{height: 100%;}
       #footer{height:100%; margin:10px 0px;}

       /* 콘텐트바의 전반적인 틀 */
       #content>div{width: 100%;}
       #content1{height: 5%;}
       #content2{height: 20%;}
       #content3{height: 75%;}

       /* 콘텐트바의 세부적인 틀 */
       #content1>h3{margin-top: 50px; padding: 20px;}
       #content2>*{height: 100%; float: left;}
       #content2_1{
           width: 40%; 
           padding: 30px;
           padding-top: 0px;
           padding-bottom: 50px;
           
        }
       #demo{width: 100%; height: 100%;}
       #demo>div{width: 100%; height: 100%;}
       .carousel-inner>img{width: 100%; height: 100%; margin: auto;} 
       #content2_2{
           width: 60%;
           display: inline-block;
           padding-left: 50px;
        }
       #content2_2>*{
           width: 100%;
           float: left;
        }
       #content2_2_1{
           height: 80%;
           display: inline-block;
           padding-left: 50px;
           padding-bottom: 10px;
        }
       #content2_2_2{height: 20%;}
       #content2_2_1 span{
            display: inline-block;
            padding-bottom: 10px;
            font-weight: 900;
            color: rgba(255, 123, 0, 0.986);
       }
       .progress{width: 300px;}

       #content2_2_2>div{
           height: 100%;
           width: 33.3%;
           float: left;
           padding-bottom: 10px;
       }
       #content2_2_2>div>button{
           width: 100px;
           display: block;
           margin: auto;
       }
       #content2_2_2>div>button:hover{
            background: rgb(139, 139, 139);
        }

       #content3>div{width: 100%; float: left;}
       #content3_1{height: 10%;}
       #content3_2{height: 90%;}
       #content3_1>div{
            height: 100%; 
            width: 25%; 
            float: left;
            display:block
        }
        #content3_1>div>button{
            width: 90%;
            display: block;
            margin: auto;
            border-radius: 15px;
            border-bottom-right-radius: 0px;
            border-bottom-left-radius: 0px;
        }
        #content3_1>div>button:hover{
            background: rgb(139, 139, 139);
        }
        
      
       /* 푸터바의 전반적인 틀 */
    #footerbar {
        position: absolute;
        top: 100%;
        width: 100%;
        height: 270px;
        background-color: #00251a
    }

    .footerbar_totalWrapper {
        width: 1200px;
        height: 100%;
        border-bottom: 1px solid white;
        margin: auto;
    }

    .footer_upperWrapper {
        width: 100%;
        height: 52px;
        border-bottom: 1px solid white;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .footer_upperWrapper>button {
        margin-left: 40px;
    }

    .footer_belowWrapper {
        height: 200px;
        display: flex;
        justify-content: center;
        align-items: center;
    }

</style>

</head>
<body>

<%@ include file="../common/commonNavbar.jsp"%>
    <div class="wrap">
        <div id="content">
            <div id="content1">
                <h3><b>[물품게시글 제목]</b></h3>
            </div>
            <div id="content2">
                <div id="content2_1">
                    <div id="demo" class="carousel slide" data-ride="carousel">

                        <!-- Indicators -->
                        <ul class="carousel-indicators">
                          <li data-target="#demo" data-slide-to="0" class="active"></li>
                          <li data-target="#demo" data-slide-to="1"></li>
                          <li data-target="#demo" data-slide-to="2"></li>
                        </ul>
                      
                        <!-- The slideshow -->
                        <div class="carousel-inner">
                          <div class="carousel-item active">
                            <img src="../../resources/images/coBuying/무선청소기1.jpg" alt="" width="100%">
                          </div>
                          <div class="carousel-item">
                            <img src="../../resources/images/coBuying/무선청소기2.jpg" alt="">
                          </div>
                          <div class="carousel-item">
                            <img src="../../resources/images/coBuying/무선청소기3.jpeg" alt="">
                          </div>
                        </div>
                      
                        <!-- Left and right controls -->
                        <a class="carousel-control-prev" href="#demo" data-slide="prev">
                          <span class="carousel-control-prev-icon"></span>
                        </a>
                        <a class="carousel-control-next" href="#demo" data-slide="next">
                          <span class="carousel-control-next-icon"></span>
                        </a>
                      
                      </div>
                      
                </div>
                <div id="content2_2">
               
                    <form action="">
                        <div id="content2_2_1">
                            <span>모집 기간 :</span> 2020/10/01 ~ 2020/10/15 <br>
                            <span>남은 기간 :</span> 14일 <br>
                            <span>최소 인원 :</span> 30명 <br>
                            <span>현재 인원 :</span>
                              <div class="progress">
                                <div class="progress-bar bg-success" style="width:70%">70명</div>
                              </div> <br>
                            <span>가격 :</span> 150000원 <br>
                            <span>옵션 : </span>
                                <select name="product" id="product">
                                    <option value="red">red</option>
                                    <option value="white">white</option>
                                    <option value="black">black</option>
                                </select>
                           
                        </div>
                       
                        

                        <div id="content2_2_2">
                            <div id="interst">
                                <a href="찜하기목록이랑연결" class="btn btn-secondary btn-sm">찜하기</a>
                            </div>
                            <div id="buy">
                                <a href="구매결제창으로연결" class="btn btn-secondary btn-sm">구매하기</a>
                            </div>
                            <div id="report">
                                <a href="신고하기페이지로연결" class="btn btn-secondary btn-sm">신고하기<a>
                            </div>
                            
                        </div>
                    </form>
                   
                   
                </div>
            </div>
            <div id="content3">
              
                    <div id="content3_1">
                        <div id="content3_1_1">
                            <button type="button" onclick="showExplan()" class="btn btn-dark">상세설명</button>
                        </div>
                        <div id="content3_1_2">
                            <button type="button" onclick="showMoney()" class="btn btn-dark">입금방법</button>
                        </div>
                        <div id="content3_1_3">
                            <a href="<%= contextPath %>/buyerlist.qna.jy?currentPage=1" type="button" class="btn btn-dark">Q&A</a>
                        </div>
                        <div id="content3_1_4">
                            <button type="button" onclick="showRefund()" class="btn btn-dark">교환 및 환불</button>
                        </div>
                        
                        
                    </div>
                    <div id="content3_2">
                        <div id="showExplan"><b>상세설명 버튼클릭시 보여질 내용(에디터로 서술한 것), 아무버튼누르지 않았을땐 이 창이 default</b></div>
                        <div id="showMoney" style="display: none;"><b>입금방법 버튼클릭시 보여질 내용(에디터로 서술한 것)</b></div>
                        <div id="showRefund" style="display: none;"><b>교환 및 환불 버튼클릭시 보여질 내용(에디터로 서술한 것)</b></div>
                    </div>

                    


                    
            </div>
        </div>

    </div>

    <footer id="footerbar">
        <div class=footerbar_totalWrapper>
            <div class="footer_upperWrapper">
                <button class="btn btn-secondary">공지사항</button>
                <button class="btn btn-secondary">고객센터</button>
                <button class="btn btn-secondary">개인정보 취급방침</button>
                <button class="btn btn-secondary">회사소개</button>
            </div>
            <div class="footer_belowWrapper">
                <p style="color:white">footer</p>
            </div>
        </div>

    </footer>


</body>
</html>