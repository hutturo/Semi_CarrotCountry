package com.javachip.carrotcountry.coBuying.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javachip.carrotcountry.coBuying.model.service.QnAService;
import com.javachip.carrotcountry.coBuying.model.vo.QnA;
import com.javachip.carrotcountry.coBuying.model.vo.PageInfo;

/**
 * Servlet implementation class BuyerQnAListController
 */
@WebServlet("/buyerlist.qna.jy")
public class BuyerQnAListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyerQnAListController() {
        super();
        // TODO Auto-generated constructor stub
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				int bno = Integer.parseInt(request.getParameter("bno"));
				int result = new QnAService().increaseCount(bno);
		
				
				
				if(result > 0) { // 유효한게시글
			
		// ---------------------------- 페이징 처리 -------------------------------------
				int listCount;					// 현재 일반게시판 총 갯수
				int currentPage;				// 사용자가 요청한 페이지 (즉, 현재 페이지)
				int pageLimit;					// 한 페이지 하단에 보여질 페이지 최대갯수
				int boardLimit;					// 한 페이지 내에 보여질 게시글 최대갯수
				
				int maxPage;					// 전체 페이지들 중에서 가장 마지막 페이지 수
				int startPage;					// 현재 사용자가 요청한 페이지에 하단에 보여질 페이징바의 시작수
				int endPage;					// 현재 사용자가 요청한 페이지에 하단에 보여질 페이징바의 끝수
				
				
				// * listCount : 현재 일반 게시판 총 갯수
				listCount = new QnAService().selectQnAListCount();
				
				// * currentPage : 사용자가 요청한 페이지 (즉, 현재 페이지)
				currentPage = Integer.parseInt(request.getParameter("currentPage"));
				
				// * pageLimit : 한 페이지 하단에 보여질 페이지 최대갯수 (몇 개 단위씩 보여지게 할건지)
				pageLimit = 10;
				
				// * boardLimit : 한 페이지 내에 보여질 게시글 최대갯수 (몇 개 단위씩 보여지게 할건지)
				boardLimit = 10;
				
				// * maxPage : 제일 마지막 페이지 수
				maxPage = (int)Math.ceil((double)listCount/boardLimit);

				startPage = (currentPage - 1) / pageLimit * pageLimit + 1;
			
				endPage = startPage + pageLimit - 1;
				
				// 만약 maxPage가 고작 13까지밖에 안된다면? endPage를 다시 13으로 해줘야됨
				if(endPage > maxPage) {
					endPage = maxPage;
				}
				
				// 페이징바를 만들때 필요한 정보들이 담겨있는 pageInfo 객체
				PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
				
				// 사용자가 요청한 페이지에 뿌려줄 게시글 리스트
				ArrayList<QnA> list = new QnAService().selectQnAList(pi, bno);
				
				request.setAttribute("pi", pi);
				request.setAttribute("list", list);
				request.setAttribute("bno", bno);
				request.getRequestDispatcher("views/coBuying/buyerQnAListView.jsp").forward(request, response);
				
				}else {
					
					request.setAttribute("errorMsg", "유효한 게시글이 아닙니다");
					request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
					
				}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
