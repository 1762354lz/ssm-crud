<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>
<body>
<div align="center">
    <form action="student/add.do" method="post">
        <table>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"></td>

            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"></td>

            </tr>
            <tr>
                <td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
                <td><input type="submit" name="增加"></td>
                <td><a href="update.jsp" >更改学生</a></td>
                <td><a href="selectone.jsp" >查询学生</a></td>
                <td><a href="selectall.jsp" >列表学生</a></td>
                <td><a href="delete.jsp" >删除学生</a></td>

            </tr>


        </table>
    </form>

</div>
</body>
</html>
