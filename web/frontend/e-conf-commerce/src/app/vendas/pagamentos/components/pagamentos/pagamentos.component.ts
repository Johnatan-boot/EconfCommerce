import { Component, OnInit } from '@angular/core';
import { CheckoutService } from 'src/app/services/vendas';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-pagamentos',
  templateUrl: './pagamentos.component.html',
  styleUrls: ['./pagamentos.component.scss']
})
export class PagamentosComponent implements OnInit {
 // $pagamentoCompra: Observable<PagamentoCompras>;
  paymentHandler: any = null;

  success: boolean = false

  failure:boolean = false
  constructor(
    private checkout: CheckoutService,
    //private pagamentoCompraService: PagamentoCompraService
    ) {}

  ngOnInit(): void {
    this.invokeStripe();
    // this.$pagamentoCompra = this.pagamentoCompraService.getpagamentoCompra();
  }

  /* onSubmit(f: NgForm) {
    this.pagamentoCompraService.requestMemberSession(f.value.priceId);
  }*/

  
  makePayment(amount: number) {
    const paymentHandler = (<any>window).StripeCheckout.configure({
      key: 'pk_test_51LUYKtAHy84crkZnKHqeAwoZvX0cO11esoDGWVLohUNLsopDC4JGe7vDC0xVmK2Jrk2I99vSUzQAncT7fwhSKuqh00JQTR26gA',
      locale: 'auto',
      token: function (stripeToken: any) {
        console.log(stripeToken);
        paymentstripe(stripeToken);
      },
    });
 
    const paymentstripe = (stripeToken: any) => {
      this.checkout.makePayment(stripeToken).subscribe((data: any) => {
        console.log(data);
        if (data.data === "success") {
          this.success = true
        }
        else {
          this.failure = true
        }
      });
    };
 
    paymentHandler.open({
      name: 'Coding Shiksha',
      description: 'This is a sample pdf file',
      amount: amount * 100,
    });
  }
 
  invokeStripe() {
    if (!window.document.getElementById('stripe-script')) {
      const script = window.document.createElement('script');
      script.id = 'stripe-script';
      script.type = 'text/javascript';
      script.src = 'https://checkout.stripe.com/checkout.js';
      script.onload = () => {
        this.paymentHandler = (<any>window).StripeCheckout.configure({
          key: 'pk_test_51LUYKtAHy84crkZnKHqeAwoZvX0cO11esoDGWVLohUNLsopDC4JGe7vDC0xVmK2Jrk2I99vSUzQAncT7fwhSKuqh00JQTR26gA',
          locale: 'auto',
          token: function (stripeToken: any) {
            console.log(stripeToken);
          },
        });
      };
 
      window.document.body.appendChild(script);
    }
  }


}
