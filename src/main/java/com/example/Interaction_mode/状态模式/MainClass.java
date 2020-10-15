package com.example.Interaction_mode.状态模式;

import com.example.Interaction_mode.状态模式.model.HomeContext;
import com.example.Interaction_mode.状态模式.service.impl.BookedStateServiceImpl;
import com.example.Interaction_mode.状态模式.service.impl.FreeStateServiceImpl;
/**
 * @Author missli
 * @Description https://my.oschina.net/u/3995125/blog/3054183
 * 1、状态模式重点在各状态之间的切换从而做不同的事情，而策略模式更侧重于根据具体情况选择策略，并不涉及切换。
 *
 * 2、状态模式不同状态下做的事情不同，而策略模式做的都是同一件事，例如聚合支付平台，有支付宝、微信支付、银联支付，虽然策略不同，但最终做的事情都是支付，
 * 也就是说他们之间是可替换的。反观状态模式，各个状态的同一方法做的是不同的事，不能互相替换。
 *
 * 状态模式封装了对象的状态，而策略模式封装算法或策略。因为状态是跟对象密切相关的，它不能被重用；而通过从Context中分离出策略或算法，我们可以重用它们。
 *
 * 在状态模式中，每个状态通过持有Context的引用，来实现状态转移；但是每个策略都不持有Context的引用，它们只是被Context使用。
 * @Date 2020/10/15 16:05
 */
public class MainClass {

	public static void main(String[] args) {
		HomeContext ctx = new HomeContext();

		ctx.setState(new FreeStateServiceImpl());
		ctx.setState(new BookedStateServiceImpl());
	}
}
