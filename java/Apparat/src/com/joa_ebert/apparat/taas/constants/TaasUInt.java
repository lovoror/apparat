/*
 * This file is part of Apparat.
 * 
 * Apparat is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Apparat is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Apparat. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright (C) 2009 Joa Ebert
 * http://www.joa-ebert.com/
 * 
 */

package com.joa_ebert.apparat.taas.constants;

import com.joa_ebert.apparat.taas.types.UIntType;

/**
 * 
 * @author Joa Ebert
 * 
 */
public class TaasUInt extends TaasNumeric
{
	public final long value;

	public TaasUInt( final long value )
	{
		super( UIntType.INSTANCE );

		this.value = value;
	}

	@Override
	public TaasNumeric add( final TaasNumeric numeric )
	{
		verifyType( numeric, TaasUInt.class );
		return new TaasUInt( value + ( (TaasUInt)numeric ).value );
	}

	@Override
	public TaasNumeric divide( final TaasNumeric numeric )
	{
		verifyType( numeric, TaasUInt.class );
		return new TaasUInt( value / ( (TaasUInt)numeric ).value );
	}

	@Override
	public TaasNumeric modulo( final TaasNumeric numeric )
	{
		verifyType( numeric, TaasUInt.class );
		return new TaasUInt( value % ( (TaasUInt)numeric ).value );
	}

	@Override
	public TaasNumeric multiply( final TaasNumeric numeric )
	{
		verifyType( numeric, TaasUInt.class );
		return new TaasUInt( value * ( (TaasUInt)numeric ).value );
	}

	@Override
	public TaasNumeric subtract( final TaasNumeric numeric )
	{
		verifyType( numeric, TaasUInt.class );
		return new TaasUInt( value - ( (TaasUInt)numeric ).value );
	}

	@Override
	public String toString()
	{
		return "[TaasUInt value: " + Long.toString( value ) + "]";
	}

}
