<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<style type="text/css">*{font-size: 12px;}</style>
<html>
    <body>
        <div style="margin:30px 50px 20px 50px; text-align:center">
            <div style="font-size:14px; font-weight:bold">用户登录</div>
            <div>
                <s:form action="checkLogin" namespace="/login">
                    <s:textfield name="username" style="font-size:12px; width:120px" label="登录名称" />
                    <s:password name="password" style="font-size:12px; width:120px" label="登录密码" />
                    <s:submit value="登  录"/>
                </s:form>
            </div>
        </div>
    </body>
</html>
