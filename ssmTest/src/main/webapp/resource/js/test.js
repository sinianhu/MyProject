<table style='border: 1px solid lavender;width: 100%;text-align: center;'>
	     <thead>
	         <tr>
	             <th>序号</th>
	             <th>编号</th>
	             <th>姓名</th>
	             <th>昵称</th>
	             <th>邮箱</th>
	             <th>密码</th>
	             <th>Q号码</th>
	             <th>创建时间</th>
	             <th>登录登录时间</th>
	             <th>状态</th>
	         </tr>
	     </thead>
	     <tbody>	  
		{{each value as d i}}   
	     		<tr>
					<td>{{i}}</td>	     		
	     			<td>{{d.id}}</td>
	     			<td>{{d.name}}</td>
	     			<td>{{d.nickname}}</td>
	     			<td>{{d.email}}</td>
	     			<td>{{d.password}}</td>
	     			<td>{{d.number}}</td>
	                <td>
	                	{{if d.status==1}}
	                		'正常'
	                		{{else}}
	                		'锁定'
	                	{{/if}}	                
	                </td>
	     		</tr>
		{{/each}}
 		</table>
 		